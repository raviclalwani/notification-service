# Notification Service Microservice
A Spring Boot microservice that allows users to manage notifications as part of a personal finance management application.

---
# Features
- RESTful API for sending and viewing notifications

- Stores notifications in memory (or H2 DB if extended)

- OpenAPI (Swagger) documentation for easy API exploration

- API-first contract in OpenAPI YAML file

- Postman collection provided for testing


---
# Project Structure
notification-service/
├── src/
│   ├── main/
│   │   ├── java/com/example/
│   │   │     ├── controller/
│   │   │     ├── model/
│   │   │     ├── config/
│   │   │     └── NotificationServiceApplication.java
│   │   └── resources/
│   │         ├── application.properties
│   │         └── notification.yaml
├── postman/notification-service.postman_collection.json
├── pom.xml
└── README.md

---
# Getting Started
Prerequisites
Java 17+

Maven 3.5+

(Port 9091 used by default; can be changed in application.properties)

---
# Build and Run
1. Clone the repository

    git clone https://github.com/raviclalwani/notification-service.git

    cd notification

2. Build the project 
   - mvn clean install

3. Run the application 
   - ./mvn spring-boot:run

---
# API Documentation
 - Swagger UI: http://localhost:9091/swagger-ui.html

 - OpenAPI/Swagger Spec: src/main/resources/notification.yaml

---
# H2 Database Console
http://localhost:9091/h2-console

JDBC URL: jdbc:h2:mem:notificationdb

Username: sa, Password: (leave blank)

---
# Using the API with Postman

1. Import Collection

    - Go to Postman → Import

    - Select postman/notification-service.postman_collection.json

2. Explore Endpoints

    - Use provided requests for /notifications to simulate budget exceedance alerts.

    - Use GET /notifications to view all sent notifications.

---
| Method | URL            | Description            |
| ------ | -------------- | ---------------------- |
| POST   | /notifications | Send new notification  |
| GET    | /notifications | List all notifications |

---
# Configuration
    Example application.properties:
    server.port=9091
    spring.datasource.url=jdbc:h2:mem:notificationdb
    spring.h2.console.enabled=true
    spring.jpa.hibernate.ddl-auto=update

---
# Extending the Service

- Integrate with Expense microservices via REST calls

- Switch to persistent DB by changing datasource configuration

---
# License
Open-source. See LICENSE file (if included).



