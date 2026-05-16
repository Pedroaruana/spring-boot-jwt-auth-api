# 🔐 Spring Boot JWT Auth API

API REST desenvolvida com Spring Boot, Spring Security e JWT para autenticação de usuários e proteção de rotas.

---

## 🚀 Funcionalidades

- Registro de usuários
- Login com autenticação
- Geração de token JWT
- Proteção de rotas privadas
- Sistema stateless com Spring Security

---

## 🛠️ Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- Hibernate
- MySQL (ou H2)
- Maven

---

## 🔑 Autenticação

### Registro
GET /auth/register?username=pedro&password=123456

### Login
GET /auth/login?username=pedro&password=123456

Retorna um token JWT

---

## 🔒 Rota protegida

GET /private

Header:
Authorization: Bearer SEU_TOKEN_AQUI

---

## ▶️ Como rodar
## ▶️ Como testar a API

Execute o projeto localmente e acesse:

- http://localhost:8080/private
- http://localhost:8080/auth/login?username=pedro&password=123456
⚠️ Observação: projeto roda localmente (não está deployado ainda)
---

## 🧪 Testes

Use navegador ou Postman

---

## 👨‍💻 Autor

Pedro Aruanã