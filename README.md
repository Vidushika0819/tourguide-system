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
│ ├── css/
│ ├── javascript/
│ ├── images/
│ ├── META-INF/
│ ├── WEB-INF/
│ ├── create.jsp
│ ├── display.jsp
│ ├── update.jsp
│ └── wrong.jsp
│
└── database/tourguide.sql


---

## 🛢️ Database Schema

Create database:
```sql
CREATE DATABASE tourguide_db;
```

Create table:
```sql
CREATE TABLE guides (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(150),
  age INT,
  experience INT,
  language VARCHAR(255)
);
```

##🚀 How to Run

### 1️⃣ Install Requirements

JDK 8+

Apache Tomcat 8/9/10

MySQL Server

Eclipse / IntelliJ IDEA

### 2️⃣ Configure Database

Update DB credentials in:

```
DBConnection.java
```

Example:
```
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/tourguide_db",
    "root",
    ""
);
```
### 3️⃣ Run on Tomcat

Upload project → Run on server → Open browser:
```
http://localhost:8080/tourguide-system/
```

## 🧰 Technologies Used

Java Servlets

JSP

JDBC

HTML / CSS

MySQL

MVC Architecture

## 📄 License

This project is licensed under the MIT License.
See LICENSE for details.

## 👩‍💻 Author

Vidushika
Undergraduate Software Engineering Student
