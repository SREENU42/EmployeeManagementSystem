# Employee Management System

🚀 **Employee Management System (EMS)** is a **RESTful backend application** built with **Java Spring Boot** and **MySQL**, designed to manage employee data efficiently. This project demonstrates clean architecture, best practices, and CRUD operations for enterprise-level backend systems.

---

## 🛠️ Technologies Used

- **Backend Framework:** Java 17, Spring Boot 3.2.2
- **Database:** MySQL (H2 for testing)
- **ORM:** Spring Data JPA / Hibernate
- **API Design:** RESTful endpoints (GET, POST, PUT, DELETE)
- **Build Tool:** Maven
- **Testing & API Client:** Postman
- **Other:** Lombok (optional), HikariCP connection pooling

---

## 📌 Project Features

- **Employee CRUD Operations**
    - Add, update, delete, and retrieve employee data.
    - Batch creation of multiple employees.
- **DTO Layer**
    - Uses Data Transfer Objects to decouple database entities from API responses.
- **Exception Handling**
    - Handles missing employee errors gracefully.
- **Layered Architecture**
    - Controller → Service → Repository → Entity structure.
- **Database Integration**
    - MySQL database with JPA mapping.
- **API Testing**
    - Verified using Postman for all CRUD operations.

---

## 🌐 API Endpoints

| HTTP Method | Endpoint                   | Description                        |
|------------|----------------------------|------------------------------------|
| GET        | `/api/employees`           | Get all employees                  |
| GET        | `/api/employees/{id}`      | Get employee by ID                 |
| POST       | `/api/employees`           | Create a new employee              |
| POST       | `/api/employees/batch`     | Create multiple employees          |
| PUT        | `/api/employees/{id}`      | Update an existing employee        |
| DELETE     | `/api/employees/{id}`      | Delete an employee                 |

---

## 💻 Sample JSON Requests

**Single Employee POST:**

```json
{
  "name": "Alice",
  "email": "alice@example.com",
  "role": "Developer"
}
