# Content Platform API

A RESTful API built with **Java, Spring Boot, and MongoDB** that simulates a content platform where users can create posts and interact through comments.

This project was designed to apply backend engineering best practices, focusing on scalable architecture, data modeling for document databases, and efficient query strategies.

---

## 🚀 Tech Stack

- Java 21+
- Spring Boot
- Spring Data MongoDB
- Maven
- MongoDB
- REST APIs

---

## 🧠 Architecture

The application follows a **layered architecture**:

Controller → Service → Repository → Database

Key design decisions include:

✅ DTO pattern for secure data exposure  
✅ Embedded documents vs references (MongoDB modeling)  
✅ Global exception handling  
✅ Custom queries with `@Query`  
✅ Case-insensitive search  
✅ Multi-criteria filtering (text + date range)

---

### Relationships:

- A **User** can have multiple Posts
- A **Post** has one Author
- A **Post** can contain multiple Comments
- Comments embed author data for faster reads

This structure balances **normalization and performance**, leveraging MongoDB’s document-oriented design.

---

## 🔎 Features

### Users
- Create user
- Update user
- Delete user
- Find user by id
- List all users
- Retrieve posts from a specific user

### Posts
- Find post by id
- Search posts by title
- Advanced full-text search
- Filter posts by date range

### Comments
- Add comments to posts
- Embedded comment structure

---

## 🔍 Advanced Queries Example

Search posts containing a text in:

- title
- body
- comments

Within a specific date range:
```bash
GET /posts/fullsearch?text=travel&minDate=2018-03-01&maxDate=2018-03-30
```

---

## 🎯 What I Learned
This project strengthened my ability to:
- Design RESTful APIs
- Model data for NoSQL databases
- Apply clean architecture principles
- Handle exceptions professionally
- Build production-style backend systems

## 👩‍💻 Author

Carla Lira Rodrigues 

Backend Developer focused on Java & Spring.
