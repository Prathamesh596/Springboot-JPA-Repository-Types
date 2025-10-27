# Springboot-JPA-Repository-Types

# Implemented Relationships:

One-to-Many: User → Address (one user can have multiple addresses)

Many-to-One: Address → User (each address belongs to one user)

One-to-One: Student ↔ Laptop (each student has one laptop)

Many-to-Many: User ↔ Student (users can enroll multiple students, and students can belong to multiple users)

 # Tech Stack:

Backend: Java, Spring Boot, Spring Data JPA

Database: MySQL

Build Tool: Maven

IDE: IntelliJ IDEA

# Features:

Demonstrates all major JPA mapping annotations:

@OneToMany, @ManyToOne, @OneToOne, @ManyToMany

@JoinColumn, @JoinTable, @CascadeType

Integrated with MySQL database

# Concepts Covered:

JPA Entity Relationships

Repository Layer Architecture

Dependency Injection (@Autowired)

Database Schema Mapping and Cascade Operations

# Folder Structure
src/main/java/com/example/demo
│
├── entity/
│   ├── User.java
│   ├── Address.java
│   ├── Student.java
│   └── Laptop.java
│
├── repository/
   ├── UserRepository.java
   ├── AddressRepository.java
   ├── StudentRepository.java
   └── LaptopRepository.java

