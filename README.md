# API Restful - Spring Boot Web

Esta aplicação é uma **API Restful** desenvolvida em **Spring Boot**, com documentação automática via **Swagger/OpenAPI**, organizada em **controllers** e com **tratamento centralizado de exceções** habilitado.

---

## 📌 Funcionalidades

* Estrutura de projeto baseada em **camadas (controllers, services, repositories)**.
* **Documentação da API** com Swagger UI.
* **Tratamento de exceções global** com `@ControllerAdvice`.
* **Boas práticas RESTful** aplicadas (métodos HTTP, status codes e responses).

---

## 🛠️ Tecnologias Utilizadas

* **Java 17**
* **Spring Boot 3**
* **Spring Web**
* **Swagger / Springdoc OpenAPI**
* **Maven**

---

## 📂 Estrutura do Projeto

```
src/main/java/com/seuprojeto
 ├── controller       # Controladores REST (endpoints da API)
 ├── doc              # Documentação da API
 ├── handler          # Classes de exceções e handlers globais
 ├── model            # Entidades / DTOs
 └── repository       # Acesso a Dados
 
```

---

## ▶️ Como Executar

### Pré-requisitos

* **Java 17+**
* **Maven**

### Passos

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/sua-api.git
   ```

2. Acesse a pasta do projeto:

   ```bash
   cd sua-api
   ```

3. Compile e rode:

   ```bash
   ./mvnw spring-boot:run
   ```

4. A aplicação estará disponível em:

   ```
   http://localhost:8080
   ```

---

## 📖 Documentação da API

Após iniciar a aplicação, acesse:

* **Swagger UI** → [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
* **OpenAPI Docs (JSON)** → [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

---

## ⚠️ Tratamento de Exceções

O projeto possui um `@ControllerAdvice` para capturar erros e retornar respostas padronizadas, como:

```json
{
  "timestamp": "2025-08-16T20:10:00",
  "status": 404,
  "error": "Not Found",
  "message": "Recurso não encontrado",
  "path": "/api/v1/exemplo/10"
}
```

---

## ✅ Boas Práticas Implementadas

* Uso correto dos **métodos HTTP** (`GET`, `POST`, `PUT`, `DELETE`).
* Retorno de **status codes adequados** (`200`, `201`, `400`, `404`, `500`).
* **DTOs** para entrada e saída de dados.
* **Swagger** para facilitar consumo da API.
* **Tratamento centralizado de exceções**.

---

## 📌 Próximos Passos (Sugestões)

* Implementar autenticação/autorização com **Spring Security + JWT**.
* Adicionar **testes unitários** e **testes de integração**.
* Configurar **CI/CD** (GitHub Actions, GitLab CI, etc).
* Deploy em **Docker** ou **Kubernetes**.
