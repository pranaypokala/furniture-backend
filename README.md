# Furniture Store Backend

## Overview

The Furniture Store Backend is a Spring Boot application designed to manage the backend operations for a furniture store web application. It provides RESTful APIs to handle operations such as adding, retrieving, and deleting furniture products. This backend is part of a larger project that includes a web frontend built with React.

## Features

- **Add Product:** Add new furniture products with details like name, description, price, and image URL.
- **Get All Products:** Retrieve a list of all furniture products stored in the database.
- **Delete Product:** Remove a specific product by its ID.

## Technologies Used

- **Spring Boot:** Framework for building the RESTful API.
- **Java Persistence API (JPA):** For interacting with the MySQL database.
- **MySQL:** Relational database used to store product information.

## Platform Used
- Springboot IDE for Eclipse
To dowload Springboot use below link:

[https://spring.io/tools]

## Project Structure

- **`src/main/java/com/example/demo/`**
  - **`controller`**: Contains REST controllers for handling HTTP requests.
  - **`model`**: Defines the JPA entity representing furniture products.
  - **`repository`**: Provides the JPA repository interface for database operations.
  - **`service`**: Contains the service layer for business logic and interactions with the repository.

## Setup Instructions

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/username/furniture-backend.git
   cd furniture-backend
   ```
2. **Configure Your Database:**
   Update the src/main/resources/application.properties file with your database settings.
3. **Run the Application:**
   ```bash
   ./mvnw spring-boot:run
   ```
   or
   Depends of the Platform Run the Springboot Application.
