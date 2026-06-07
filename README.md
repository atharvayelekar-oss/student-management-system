# 🎓 Student Management System

A Spring Boot based Student Management System that provides REST APIs for managing students, courses, searching, pagination, and sorting. The project follows a layered architecture using Controller, Service, Repository, DTO, and Entity layers.

---

## 🚀 Features

### Student Management
- Create Student
- Get All Students
- Get Student By ID
- Update Student
- Delete Student

### Search
- Search students by name

### Pagination
- Retrieve students page by page

### Sorting
- Sort students by name, student code, or other fields

### Validation
- Input validation using Jakarta Validation

### Exception Handling
- Global exception handling for resource not found and validation errors

### Database
- MySQL Integration
- Hibernate/JPA ORM

### API Documentation
- Swagger/OpenAPI Integration

---

## 🛠️ Tech Stack

- Java 24
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Maven
- Lombok
- Swagger/OpenAPI
- Hibernate

---

## 📂 Project Structure

```text
src
│
├── main
│   ├── java
│   │   └── com.example.student_management_system
│   │
│   ├── controller
│   │     └── StudentController.java
│   │
│   ├── service
│   │     ├── StudentService.java
│   │     └── StudentServiceImpl.java
│   │
│   ├── repository
│   │     └── StudentRepository.java
│   │
│   ├── dto
│   │     └── StudentDto.java
│   │
│   ├── entity
│   │     ├── Student.java
│   │     ├── Course.java
│   │     └── Address.java
│   │
│   ├── exception
│   │     ├── ResourceNotFoundException.java
│   │     └── GlobalExceptionHandler.java
│   │
│   └── StudentManagementSystemApplication.java
│
└── resources
    └── application.properties
```

---

## ⚙️ Configuration

### application.properties

```properties
spring.application.name=student-management-system

spring.datasource.url=jdbc:mysql://localhost:3306/student_management_db
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🗄️ Database Setup

Create database manually:

```sql
CREATE DATABASE student_management_db;
```

---

## ▶️ Run Application

Clone repository:

```bash
git clone https://github.com/your-username/student-management-system.git
```

Navigate to project:

```bash
cd student-management-system
```

Build project:

```bash
mvn clean install
```

Run application:

```bash
mvn spring-boot:run
```

Application runs on:

```text
http://localhost:8080
```

---

## 📖 Swagger Documentation

After starting the application:

```text
http://localhost:8080/swagger-ui/index.html
```

---

## 📬 API Endpoints

### Create Student

```http
POST /api/students
```

Request:

```json
{
  "name": "Anurag Sharma",
  "dateOfBirth": "2000-05-20",
  "gender": "Male",
  "studentCode": "STU001",
  "email": "anug@gmail.com",
  "mobileNumber": "9876543210",
  "parentName": "Mr. Sharma",
  "addresses": [],
  "courses": []
}
```

---

### Get All Students

```http
GET /api/students
```

---

### Get Student By ID

```http
GET /api/students/{id}
```

Example:

```http
GET /api/students/1
```

---

### Update Student

```http
PUT /api/students/{id}
```

---

### Delete Student

```http
DELETE /api/students/{id}
```

---

### Search Student

```http
GET /api/students/search?name=Yash
```

---

### Pagination

```http
GET /api/students/page?page=0&size=5
```

---

### Sorting

```http
GET /api/students/sort?field=name
```

---

### Pagination + Sorting

```http
GET /api/students/page-sort?page=0&size=5&field=name
```

---

## 📸 Sample Response

```json
{
  "id": 1,
  "name": "Anurag Sharma",
  "dateOfBirth": "2000-05-20",
  "gender": "Male",
  "studentCode": "STU001",
  "email": "anug@gmail.com",
  "mobileNumber": "9876543210",
  "parentName": "Mr. Sharma"
}
```

---

## 🔮 Future Enhancements

- Course Management Module
- Address Management Module
- JWT Authentication
- Role Based Authorization
- Unit Testing
- Docker Support
- AWS/Render Deployment
- Dashboard APIs
- Attendance Management
- Marks Management

---

## 👨‍💻 Author


Java Backend Developer

Technologies:
- Java
- Spring Boot
- Hibernate
- MySQL
- REST APIs
- Maven
- Git & GitHub

---
