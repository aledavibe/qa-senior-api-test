# Avaliação QA Sênior - Automação de API (Postman/Newman)

Este projeto contém a automação de testes de API para a avaliação prática de QA Sênior. O foco é a validação dos endpoints da API [JSONPlaceholder](https://jsonplaceholder.typicode.com/) utilizando **Postman** e **Newman**, incluindo a geração automática de evidências em formato **JUnit** (XML).

🔗 **Repositório Oficial:** [aledavibe/qa-senior-api-test](https://github.com/aledavibe/qa-senior-api-test)

## 📋 Tecnologias e Ferramentas

* **Postman:** Modelagem da coleção e scripts de teste (`pm.test`, `pm.expect`).
* **Node.js:** Ambiente de execução (Runtime).
* **Newman:** Runner de linha de comando para execução dos testes em CI/CD.
* **JUnit Reporter:** Recurso nativo do Newman para exportação de resultados compatíveis com Jenkins/Azure DevOps.

---

## 📂 Estrutura de Arquivos

Certifique-se de que os seguintes arquivos estejam no diretório raiz do projeto:

* `JSONPlaceholder_API.postman_collection.json`: A coleção de testes.
* `JSONPlaceholder_Env.json`: O arquivo de variáveis de ambiente.
* `README.md`: Este arquivo de documentação.

---

## 🚀 Guia Passo a Passo de Execução

Siga as etapas abaixo para configurar o ambiente e executar os testes.

### 1. Instalação dos Pré-requisitos
Para rodar este projeto, você precisa ter o **Node.js** instalado.
1. Verifique se já possui o Node instalado digitando no terminal: `node -v`
2. Caso não tenha, baixe e instale a versão LTS em [nodejs.org](https://nodejs.org/).

Com o Node.js instalado, instale o **Newman** globalmente executando o comando abaixo no terminal:

```bash
npm install -g newman