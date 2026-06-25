# Student Management System (Spring Boot MVC)

A lightweight, monolithic Spring Boot web application designed to manage student records using the MVC (Model-View-Controller) architecture pattern. This project provides full CRUD (Create, Read, Update, Delete) capabilities using an in-memory collection.

## 🚀 Features
- **Dashboard View**: List all students currently registered.
- **Add Student**: Interactive form to register a new student.
- **Update Student**: Pre-populated form to modify existing student details securely via path variables.
- **Delete Student**: Quick removal of records based on their Admission Number (`adno`).

## 🛠️ Tech Stack
- **Backend**: Java 17+, Spring Boot v3.x (Spring MVC)
- **Frontend View**: Thymeleaf (HTML templates)
- **Build Tool**: Maven

## 📁 Project Structure
```text
src/main/java/com/example/demo/
│
├── DemoApp1Application.java  # Main application entry point
├── HomeController.java       # Controller handling HTTP routing & logic
└── Student.java              # Model class representing the Student entity
