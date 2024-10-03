### Backend_Traini8_Harsh_Kumar_Yaduvanshi
This is a Spring Boot project developed as an MVP for Traini8, which includes APIs for managing Govt-funded Training Centers. The project consists of two APIs:

1. A POST API for creating and saving a new Training Center.
2. A GET API for retrieving all saved Training Centers.

## Table of Contents

# Technologies Used
# Prerequisites
# Project Setup
# Running the Application
# APIs Overview
 POST: Create Training Center
 GET: Retrieve Training Centers
# Validation
# Exception Handling



# Technologies Used
Java 17
Spring Boot 2.5+
Hibernate Validator
Spring Data JPA (Hibernate)
MySQL Database (in-memory)
Maven

# Prerequisites

Java 17
Maven 3.6+
Git (for cloning the repository)

## Project Setup
1) git clone https://github.com/YourUsername/Backend_Traini8_HarshKumarYaduvanshi.git
2) cd Trainee8PRO
3) Database Configuration :

    -> Create a Database in Mysql  <!-- For ex. my Database Name is traini8pro  -->

    -> Use below code for configuring MySQL Database, Put it in application.properties file :-

    spring.application.name=trainee8pro
    # spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
    spring.datasource.url=jdbc:mysql://localhost:3306/traini8     <!-- Enter Your Database Name  -->

    spring.datasource.username=root   <!-- Enter Your MySQL UserName  -->

    spring.datasource.password=Harsh@2000    <!-- Enter Your MySQL Password  -->
    #spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.driver-class-name=com.mysql.jdbc.Driver
    spring.jpa.show-sql: true
    spring.mvc.static-path-pattern=/**
    # spring.thymeleaf.prefix=classpath:/templates/
    spring.thymeleaf.cache=false

## Running the Application
    Once the application is running, it will be available at http://localhost:8080

    We can test the api in Postman


### APIs Overview
## POST: Create Training Center

  #  URL: /api/training-centers
    Method: POST
    Content-Type: application/json
    Request Body:
            {
        "centerName": "Tech Academy",
        "centerCode": "ABC123456789",
        "address": {
            "detailedAddress": "123 Main Street",
            "city": "Delhi",
            "state": "Delhi",
            "pincode": "110001"
        },
        "studentCapacity": 100,
        "coursesOffered": ["Java", "Python", "Data Science"],
        "contactEmail": "info@techacademy.com",
        "contactPhone": "9876543210"
        }

        Response : 
        {
        "id": 1,
        "centerName": "Tech Academy",
        "centerCode": "ABC123456789",
        "address": {
            "detailedAddress": "123 Main Street",
            "city": "Delhi",
            "state": "Delhi",
            "pincode": "110001"
        },
        "studentCapacity": 100,
        "coursesOffered": ["Java", "Python", "Data Science"],
        "createdOn": 1696314802000,
        "contactEmail": "info@techacademy.com",
        "contactPhone": "9876543210"
        }

   # GET: Retrieve Training Centers
            URL: /api/training-centers
            Method: GET
            Response : 
            [
            {
                "id": 1,
                "centerName": "Tech Academy",
                "centerCode": "ABC123456789",
                "address": {
                "detailedAddress": "123 Main Street",
                "city": "Delhi",
                "state": "Delhi",
                "pincode": "110001"
                },
                "studentCapacity": 100,
                "coursesOffered": ["Java", "Python", "Data Science"],
                "createdOn": 1696314802000,
                "contactEmail": "info@techacademy.com",
                "contactPhone": "9876543210"
            }
            ]

## Validation

            The following validations are applied:

            CenterName: Mandatory, max 40 characters.
            CenterCode: Mandatory, exactly 12 alphanumeric characters.
            Address: Detailed Address, City, State, and Pincode (6 digits, cannot start with 0) are required.
            ContactPhone: Must be exactly 10 digits.
            ContactEmail: Optional but must be valid if present.
            All validation is handled using Hibernate Validator annotations.

## Exception Handling

            In case of validation failures or incorrect input, the API will return a 400 Bad Request with details of the errors. The errors are handled by a global exception handler.

            Example error response:

            {
            "centerName": "CenterName is required and must be less than 40 characters",
            "centerCode": "CenterCode must be exactly 12 alphanumeric characters",
            "contactPhone": "Phone number must be exactly 10 digits"
            }










