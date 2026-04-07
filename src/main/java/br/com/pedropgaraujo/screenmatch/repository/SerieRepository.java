package br.com.pedropgaraujo.screenmatch.repository;

import br.com.pedropgaraujo.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
