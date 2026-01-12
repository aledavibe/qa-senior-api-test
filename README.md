# Automação de API - JSONPlaceholder

Projeto de avaliação prática QA Sênior utilizando Java, RestAssured e JUnit 5.

## 🛠 Tecnologias
- Java 11
- Maven
- RestAssured (API Testing)
- JUnit 5 (Test Runner)
- Jackson (JSON Parsing)
- JSON Schema Validator

## 🚀 Como executar
1. Abra o projeto na sua IDE.
2. Aguarde o Maven baixar as dependências.
3. Navegue até `src/test/java/com/avaliacao/tests/PostsTest.java`.
4. Execute a classe ou os métodos individualmente.

## 📋 Cenários Cobertos
1. **GET /posts**: Valida status 200, tamanho da lista (100) e não nulidade dos campos.
2. **GET /posts/{id}**: Valida integridade dos dados de um post específico.
3. **Contrato**: Valida o retorno contra o schema JSON definido.
