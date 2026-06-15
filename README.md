# PrimeCart 🛒

PrimeCart is a RESTful e-commerce backend application built with Java and Spring Boot. It provides APIs for managing products and serves as a foundation for a complete e-commerce platform.

> **Note:** This project is currently backend-only and is being developed as a learning and portfolio project for internships and placements. More features will be added gradually.

---

## 🚀 Tech Stack

* Java 21
* Spring Boot 4.0.6
* Spring Data JPA
* MySQL
* Maven
* Lombok

### Planned Technologies

* JWT Authentication
* Cloudinary (Image Storage)
* Spring Security

---

## 📂 Project Overview

PrimeCart is an e-commerce backend application that allows users to browse and manage products through REST APIs.

Currently implemented:

* Product Management APIs (CRUD Operations)

Planned features:

* Authentication & Authorization
* Shopping Cart
* Wishlist
* Orders Management
* Payment Integration
* Product Reviews & Ratings
* Admin Dashboard
* Product Image Upload with Cloudinary

---

## 🗄 Database Configuration

### Database Name

```sql
ecommerce_db
```

### Create Database

```sql
CREATE DATABASE ecommerce_db;
```

Since Spring Data JPA is used, tables will be created automatically based on entity definitions.

Update your database credentials inside:

```properties
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=your_username
spring.datasource.password=your_password

cloudinary.cloud-name = YOUR_CLOUDINARY_CLOUD_NAME
cloudinary.api-key = YOUR_CLOUDINARY_API_KEY
cloudinary.api-secret = YOUR_CLOUDINARY_API_SECRET
```

---

## ⚙️ Running the Project

### Clone Repository

```bash
git clone https://github.com/Sandeep-Kushwah/PrimeCart.git
```

### Navigate to Project

```bash
cd PrimeCart
```

### Build Project

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

Application will start on:

```text
http://localhost:8080
```

---

## 📦 Product API Endpoints

| Method | Endpoint            | Description                     |
| ------ | ------------------- | ----------------------------    |
| GET    | `/api/product`      | Retrieve all products           |
| GET    | `/api/product/{id}` | Retrieve a product by its ID    |
| POST   | `/api/product`      | Create a new product            |
| PUT    | `/api/product`      | Update existing product details |
| PUT    | `/api/product/{id}` | Update existing product image   |
| DELETE | `/api/product/{id}` | Delete a product by its ID      |

### Example Product Object

| Field         | Type    | Description                                     |
| -----------   | ------- | ----------------------------------------------- |
| id            | Long    | Unique product identifier                       |
| name          | String  | Product name                                    |
| description   | String  | Product description                             |
| brand         | String  | Product brand                                   |
| price         | long    | Product price                                   |
| discountPrice | long    | Product discount price                          |
| imageUrl      | String  | Product image URL                               |
| status        | Status  | Product status                                  |
| localDateTime | Local.  | Product creation Date and Time                  |

### 📄 Sample Product JSON

```json
{
  "id": 16,
  "name": "iPhone 18 PRO MAX",
  "description": "This is highly build quality product",
  "brand": "iPhone",
  "price": 155000,
  "discountPrice": 149999,
  "imageUrl": "http://res.cloudinary.com/dlpa9gzwn/image/upload/v1781519397/tznxlaqhtdkh4dl5hxhg.jpg",
  "status": "ACTIVE",
  "localDateTime": "2026-06-15T15:52:03.671592"
}
```


---

The JSON structure may vary.
Don't worry about the JSON field order.

---

## 📌 Current Features

* Product CRUD APIs
* MySQL Database Integration
* Spring Data JPA
* Layered Architecture
* RESTful API Design

---

## 🛠 Upcoming Features

### Authentication

* User Registration
* User Login
* JWT Authentication
* Role-Based Access Control

### Shopping Features

* Cart Management
* Wishlist Management
* Order Processing
* Checkout Flow

### Payment Features

* Online Payment Integration
* Payment Status Tracking

### Review System

* Product Reviews
* Product Ratings

### Admin Features

* Product Management
* User Management
* Order Monitoring
* Dashboard Analytics

---

## 📁 Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.example.primecart
│   │       ├── config
│   │       ├── controller
│   │       ├── dto
│   │       ├── entities
│   │       ├── enums
│   │       ├── mapper
│   │       ├── repo
│   │       └── service
│   │           └── serviceImpl
|   |
│   └── resources
│       └── application.properties
```

---

## 🎯 Purpose of This Project

This project is being developed to:

* Learn Spring Boot and Backend Development
* Understand REST API Design
* Practice Database Integration with JPA
* Implement Authentication & Security
* Build a complete E-commerce Backend
* Showcase Backend Development Skills for Internships and Placements

---

## 🤝 Contributions

Contributions, suggestions, and feedback are welcome.

Feel free to fork the repository and submit pull requests.

---

## 📜 License

This project is developed for learning and portfolio purposes.
