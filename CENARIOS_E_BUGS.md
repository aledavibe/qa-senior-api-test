# 🧪 Planejamento de Testes Manuais & Report de Bugs

Este documento descreve os casos de teste manuais desenhados para a API [JSONPlaceholder](https://jsonplaceholder.typicode.com/) e reporta inconsistências encontradas durante a fase exploratória.

---

## 📋 1. Casos de Teste (Test Cases)

### 🟢 CT01: Validar listagem completa de posts
**Objetivo:** Garantir que o endpoint retorna a lista de publicações.
* **Endpoint:** `GET /posts`
* **Pré-condição:** API Online.

| Passo | Ação | Resultado Esperado |
|:---:|:---|:---|
| 1 | Enviar requisição GET para `/posts` | Status Code **200 OK**. |
| 2 | Verificar o corpo da resposta | Deve retornar um **Array JSON**. |
| 3 | Contar itens retornados | O array deve conter **100 itens**. |

---

### 🟢 CT02: Consultar Post por ID Válido
**Objetivo:** Validar a integridade dos dados de um post específico.
* **Endpoint:** `GET /posts/1`

| Passo | Ação | Resultado Esperado |
|:---:|:---|:---|
| 1 | Enviar requisição GET para `/posts/1` | Status Code **200 OK**. |
| 2 | Analisar o JSON retornado | O campo `id` deve ser igual a **1**. |
| 3 | Verificar campos obrigatórios | `userId`, `title` e `body` não devem ser nulos. |

---

### 🟠 CT03: Consultar Post Inexistente (Cenário Negativo)
**Objetivo:** Validar o tratamento de erro para recursos não encontrados.
* **Endpoint:** `GET /posts/99999`

| Passo | Ação | Resultado Esperado |
|:---:|:---|:---|
| 1 | Enviar requisição GET para `/posts/99999` | Status Code **404 Not Found**. |
| 2 | Verificar corpo da resposta | Deve retornar um objeto vazio `{}` ou mensagem de erro padrão. |

---

### 🟠 CT04: Validar Criação de Novo Post
**Objetivo:** Garantir que é possível enviar dados para criação de recurso.
* **Endpoint:** `POST /posts`
* **Body (JSON):**
```json
{
    "title": "QA Senior Test",
    "body": "Teste de criação manual",
    "userId": 1
}