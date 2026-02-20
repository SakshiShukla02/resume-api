# 🚀 Resume Management REST API

A production-style Resume Management Backend built using Spring Boot, MySQL, and JPA.

This project demonstrates real-world backend concepts like:

- REST API Development
- CRUD Operations
- Input Validation
- Global Exception Handling
- Database Integration
- API Documentation using Swagger

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Swagger (OpenAPI)
- Git & GitHub

---

## 📌 Features

✅ Create Resume  
✅ View All Resumes  
✅ View Resume by ID  
✅ Update Resume  
✅ Delete Resume  
✅ Field Validation  
✅ Custom Exception Handling  
✅ Swagger API Documentation  

---

## 📂 Project Structure

```
controller/
model/
repository/
exception/
```

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | /api/resumes | Create Resume |
| GET    | /api/resumes | Get All Resumes |
| GET    | /api/resumes/{id} | Get Resume by ID |
| PUT    | /api/resumes/{id} | Update Resume |
| DELETE | /api/resumes/{id} | Delete Resume |

---

## 🧪 Sample Request Body

```json
{
  "name": "Sakshi Shukla",
  "email": "sakshi@gmail.com",
  "skills": "Java, Spring Boot, MySQL"
}
```

---

## 📘 Swagger Documentation

After running the project:

```
http://localhost:8080/swagger-ui.html
```

---

## 💻 How To Run Locally

1. Clone the repository
2. Configure MySQL in `application.properties`
3. Run:

```
mvn clean install
mvn spring-boot:run
```

---

## 🎯 Learning Outcome

This project strengthened my understanding of:

- RESTful API Design
- Backend Architecture
- Database Mapping with JPA
- Validation & Exception Handling
- Version Control using Git

---

## 👩‍💻 Author

Sakshi Shukla  
BTech CSIT Student  
Backend Developer (Spring Boot)

