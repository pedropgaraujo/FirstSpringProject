package br.com.pedropgaraujo.screenmatch.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class ConsultaChatGPT {

    public static String obterTraducao(String pergunta) {
        Client client = Client.builder().apiKey(System.getenv("OPENAI_API_KEY")).build();

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-3-flash-preview",
                        "Traduza para língua portuguesa o seguinte trecho da forma mais direta, não pergunte mais nada, apenas faça: "+pergunta,
                        null);

        return response.text();
    }
}