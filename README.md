# Sistema de Cartório - Projeto Final Web2

Este é o projeto final desenvolvido para a disciplina de Desenvolvimento Web 2 (CJOWEB2) do IFSP Campus Campos do Jordão. O objetivo foi criar uma aplicação web completa, utilizando arquitetura REST, persistência em banco de dados e técnicas de segurança.

## 🚀 Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot 3**
- **Spring Data JPA (Hibernate)**
- **Spring Security**
- **Validation (Jakarta Validation)**
- **H2 Database** 

## 🛠 Funcionalidades
- **CRUD Completo:** Listagem, criação, atualização e exclusão de cidadãos.
- **Validação:** Uso de `@Valid` com regras específicas (CPF, campos obrigatórios).
- **Segurança:** Autenticação via Basic Auth implementada com Spring Security.
- **Interface Web:** Interface simples em HTML/CSS/JS consumindo a API.

## 📋 Como executar o projeto

### Pré-requisitos
- JDK 17 ou superior instalado.
- Maven instalado.

### Passos para rodar
1. Clone este repositório:
   `git clone https://github.com/LucasgcTi/CJOWEB2.git`
2. Navegue até a pasta do projeto:
   `cd nome-da-pasta`
3. Execute a aplicação com Maven:
   `./mvnw spring-boot:run`
4. A API estará disponível em: `http://localhost:8080`

## 🔐 Como testar (Autenticação)
Como o projeto possui **Spring Security**, as rotas estão protegidas.
- **Usuário:** `admin`
- **Senha:** `admin123`
- Use o **Insomnia** ou **Postman** com o tipo de autenticação **Basic Auth** para testar as rotas `/cidadaos`.

## 💻 Interface Web
Você pode acessar a interface funcional diretamente através do seu navegador em:
`http://localhost:8080/index.html`

---
*Desenvolvido por: Giovanna Vendrami - Lucas Gomes*
*Professor: Fernando Vieira Duarte*
