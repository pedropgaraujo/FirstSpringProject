# 📄 README.md

## 🚀 Spring Boot Project - Episodes API

```
API developed in Java using Spring Boot for managing seasons and episodes.
```

## 📌 About the project

```
This project consists of a REST API that allows:

- Listing seasons
- Listing episodes
- Relating episodes to their respective seasons
- Applying best practices of layered architecture

The application follows modern backend development standards with a focus on organization, scalability, and maintainability.
```

## 🧱 Architecture

The project uses a layered architecture (**Layered Architecture**):

```
controller → service → repository → database
```

## 📦 Package structure

```
src/main/java/br/com/pedropgaraujo/springboot/spring
│
├── controller   # Entry layer (REST API)
├── service      # Business logic
├── repository   # Database access
├── entity       # Table representation
├── dto          # Data transfer
├── exception    # Error handling
├── config       # Configurations
└── util         # Utility classes
```

## ⚙️ Technologies used

```
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven
- Database (H2 / MySQL / PostgreSQL)
```

## 🔁 Flow example

```
1. Client sends an HTTP request
2. Controller receives the request
3. Service processes the business logic
4. Repository accesses the database
5. Response returns to the client
```

## 🧠 Example of implemented logic

The project uses Stream API to transform data, as in the example:

```

java
List<Episodio> episodios = temporadas.stream()
    .flatMap(t -> t.episodios().stream()
        .map(d -> new Episodio(t.numero(), d)))
    .collect(Collectors.toList());
```

👉 This code iterates through all seasons and generates a single list of episodes.

---

## ▶️ How to run the project

### Prerequisites

* Java 17 or higher
* Maven installed

---

### 🔧 Steps

```bash
# Clone the repository
git clone https://github.com/pedropgaraujo/FirstSpringProject.git

# Access the folder
cd your-repository

# Run the project
./mvnw spring-boot:run
```

Or on Windows:

```bash
mvnw spring-boot:run
```

---

## 🌐 API Access

After starting, access:

```
http://localhost:8080
```

---

## 📬 Endpoints (example)

| Method | Endpoint        | Description       |
| ------ | --------------- | ----------------- |
| GET    | /temporadas     | List seasons      |
| GET    | /episodios      | List episodes     |
| GET    | /episodios/{id} | Get episode by ID |

---

## ⚠️ Error handling

The API includes global exception handling using:

* `@RestControllerAdvice`
* Custom exceptions

---

## ✅ Applied best practices

* Separation of responsibilities (SRP)
* Use of DTOs
* Constructor-based dependency injection
* Clean and organized code
* Use of Stream API
* Centralized error handling

---

## 📌 Future improvements

* Authentication with Spring Security
* Documentation with Swagger/OpenAPI
* Unit tests (JUnit + Mockito)
* Cloud deployment (AWS / Render / Railway)

---

## 👨‍💻 Author

Pedro Araujo

---

## 📄 License

This project is licensed under the MIT License.
