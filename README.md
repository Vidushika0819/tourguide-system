# 🗺️ Tour Guide Management System

A Java Servlet + JSP based web application for managing tour guides.  
This system allows admins to add, update, view, and delete tour guide details using JDBC and MySQL.

This is a student project designed to demonstrate Java web development, MVC architecture, and CRUD functionality.

---

## 📌 Features

### 👤 Tour Guide Management (CRUD)
- Add new tour guides  
- Update existing guide information  
- Delete guide records  
- View all guide details  
- JSP pages for UI  
- JDBC backend with MySQL  

### 🧱 MVC Architecture
- **Model:** GuideModel.java  
- **Controller:** GuideController.java  
- **View:** JSP pages  

### 🔐 Database Handling
- DB connection via `DBConnection.java`
- Secure SQL queries using JDBC

---

## 🗂️ Project Structure
```
tourguide-system/
│
├── src/
│ └── main/
│ ├── java/tourguide/
│ │ ├── DBConnection.java
│ │ ├── Insert.java
│ │ ├── Update.java
│ │ ├── Delete.java
│ │ ├── GetAllDetails.java
│ │ ├── GuideModel.java
│ │ └── GuideController.java
│ │
│ └── webapp/
│   ├── css/
│   ├── javascript/
│   ├── images/
│   ├── META-INF/
│   ├── WEB-INF/
│   ├── create.jsp
│   ├── display.jsp
│   ├── update.jsp
│   └── wrong.jsp
│
├── .classpath
└── .project
```

---

## 🛢️ Database Schema

Create database:
```sql
CREATE DATABASE tourguide_db;
```

Create table:
```sql
CREATE TABLE guide (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone VARCHAR(10) NOT NULL,
    address VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);
```

## 🧰 Technologies Used

- Frontend - HTML, CSS, JSP
- Backend - Java Servlets
- Database - MySQL
- Database Connection - JDBC
- Local Development Server - Apache Tomcat
- Code Editor / IDE - Eclipse
- Project Structure - MVC Architecture

## 📄 License

This project is licensed under the MIT License.
See LICENSE for details.
