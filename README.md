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
How to run the project
Clone the Repository
git clone https://github.com/SREENU42/EmployeeManagementSystem.git
cd EmployeeManagementSystem

Configure Database
Option A: MySQL 

Create database:
CREATE DATABASE employee_db;

Update the database username and password as per your local setup.

Update application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Option B: H2 (Quick Run )
spring.datasource.url=jdbc:h2:mem:emsdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true

Run the Application
mvn clean spring-boot:run

If successful, they’ll see:
Employee Management System is running 🚀

Test APIs
Base URL:
http://localhost:8080/api/employees

Examples:
GET /api/employees
POST /api/employees
POST /api/employees/batch
PUT /api/employees/{id}
DELETE /api/employees/{id}
