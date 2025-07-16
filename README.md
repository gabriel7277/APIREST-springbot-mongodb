# 🌐 APIREST - Spring Boot + MongoDB

Esta é uma API RESTful desenvolvida com **Spring Boot** e **MongoDB**, focada na manipulação de usuários e postagens (posts). Ela segue boas práticas como uso de DTOs, tratamento de exceções, organização em camadas (service, repository, resource), e endpoints REST claros para operações CRUD e consultas personalizadas.

## ✅ Funcionalidades

- 📦 CRUD completo de **Usuários** e **Postagens**
- 🧩 Integração entre usuários e posts (relação 1:N)
- 📨 Comentários em postagens
- 🔎 Consultas com:
  - `@Query`
  - métodos do Spring Data (`findBy`, etc)
- 📤 Filtro de dados com **DTOs (Data Transfer Objects)**
- ⚠️ Tratamento de exceções (`ObjectNotFoundException`)
- 📁 Estrutura organizada por camadas

## 🧱 Estrutura do Projeto

src/main/java/com/gabriel/mongodb/
├── config/ # Configurações iniciais
├── domain/ # Entidades: User, Post
├── dto/ # DTOs para transferência segura de dados
├── exception/ # Exceções customizadas
├── repository/ # Interfaces do Spring Data (UserRepository, PostRepository)
├── resources/ # Controllers (UserResource, PostResource)
├── services/ # Regras de negócio (UserService, PostService)
└── WorkshopmongoApplication.java # Classe principal


## 🔧 Tecnologias Utilizadas

- Java 17+
- Spring Boot (Web, Data MongoDB)
- MongoDB
- Maven
- Spring Data JPA
- DTO Pattern
- Postman (para testes de endpoints)


## 📡 Endpoints principais

### 👤 Usuários

- `GET /users` → listar usuários  
- `GET /users/{id}` → buscar usuário por ID  
- `POST /users` → cadastrar novo usuário  
- `PUT /users/{id}` → atualizar usuário  
- `DELETE /users/{id}` → deletar usuário  

### 📝 Postagens

- `GET /posts` → listar postagens  
- `GET /posts/{id}` → buscar postagem por ID  
- `GET /posts/title?text=...` → buscar post por título  
- `GET /posts/fullsearch?text=...&minDate=...&maxDate=...` → busca completa por texto e intervalo de datas  
- `POST /users/{id}/posts` → cadastrar post para um usuário  
- `POST /posts/{id}/comments` → adicionar comentário
