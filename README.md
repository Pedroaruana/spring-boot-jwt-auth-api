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

git clone https://github.com/SEU_USUARIO/spring-boot-jwt-auth-api.git  
cd spring-boot-jwt-auth-api  
mvn spring-boot:run  

---

## 🧪 Testes

Use navegador ou Postman

---

## 👨‍💻 Autor

Thiago Mascarenhas