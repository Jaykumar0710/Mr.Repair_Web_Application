# Mr. Repair - Home Repair Service Platform

## Overview
**Mr. Repair** is a web-based platform designed to connect experienced repair professionals with clients in metro cities. The platform allows workers like electricians, plumbers, and carpenters to easily find job opportunities, while clients can conveniently book skilled workers for home repair tasks. This project leverages **Spring Boot**, **Thymeleaf**, **Bootstrap**, and **MySQL** to provide a robust and scalable solution for both workers and clients.

## Features
- **Responsive User Interface**: Designed with Bootstrap to ensure seamless functionality across various devices and screen sizes.
- **User Registration**: Clients and workers can register for future offers and services.
- **Service Booking**: Clients can browse available workers and book services for home repair tasks.
- **Admin Dashboard**: Admins can manage worker registrations, client details, and perform CRUD operations on worker data.
- **Database Management**: All data, including user info, job applications, and service requests, are stored in a MySQL database.

## Technologies Used
- **Backend**: 
  - **Spring Boot**: Backend framework for creating RESTful services.
   - **JPA/Hibernate**: ORM for database operations.
  - **Thymeleaf**: Template engine for dynamic content rendering.
- **Frontend**:
  - **Bootstrap**: Used for responsive design.
  - **CSS/HTML5**: For styling and structuring the web pages.
  - **Font Awesome**: Icons for UI components.
- **Database**:
  - **MySQL**: Relational database for storing worker, client, and service data.
- **Others**:
  - **Maven**: For project dependency management.
  - **Git**: Version control system.
  - **Render**: For deployment.

## Installation Guide

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Jaykumar0710/Mr.Repair_Web_Application.git

## Navigate to the project directory:
    cd mr-repair

## Install dependencies: Make sure you have Maven installed and run:
    mvn clean install

## Database Setup: 
Create a MySQL database named mr_repair and update the database credentials in application.properties

## Run the Application:
    mvn spring-boot:run
    
## Access the Application: Open your browser and go to:
    http://localhost:8080

## Database Configuration
In your application.properties, update your MySQL configurations:
spring.datasource.url=jdbc:mysql://localhost:3306/mr_repair
spring.datasource.username=root
spring.datasource.password=JaY@0710
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


## Thaking You !

