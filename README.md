# Microservices Project

This project is a microservices-based architecture using Spring Boot, Angular, and Docker. It includes several services such as Product Service, Client Service, Sale Service, Gateway Service, Discovery Service, Config Service, and Keycloak for authentication.

## Table of Contents

- [Architecture](#architecture)
- [Services](#services)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Endpoints](#endpoints)
- [Technologies Used](#technologies-used)

## Architecture

The project follows a microservices architecture with the following components:

- **Discovery Service**: Service registry using Eureka.
- **Config Service**: Centralized configuration using Spring Cloud Config.
- **Gateway Service**: API Gateway using Spring Cloud Gateway.
- **Product Service**: Manages products.
- **Client Service**: Manages clients.
- **Sale Service**: Manages sales.
- **Keycloak**: Identity and access management.
- **PostgreSQL**: Database for Keycloak.
- **PgAdmin**: Database management tool for PostgreSQL.
- **Angular Frontend**: User interface for interacting with the services.

## Services

### Discovery Service

- Port: 8761
- Service registry for microservices.

### Config Service

- Port: 9999
- Centralized configuration management.

### Gateway Service

- Port: 8888
- API Gateway for routing requests to microservices.

### Product Service

- Port: 8091
- Manages product-related operations.

### Client Service

- Port: 8090
- Manages client-related operations.

### Sale Service

- Port: 8092
- Manages sale-related operations.

### Keycloak

- Port: 8080
- Identity and access management.

### PostgreSQL

- Port: 5432
- Database for Keycloak.

### PgAdmin

- Port: 8899
- Database management tool for PostgreSQL.

### Angular Frontend

- Port: 80
- User interface for interacting with the services.

## Prerequisites

- Docker
- Docker Compose
- Java 21
- Node.js
- Yarn or npm

## Setup

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/Ouss3/microservices-project.git
cd microservices-project
```

### 2. Build the Services
```bash
./mvnw clean package
```

### 3. Build the Angular Frontend
```bash
cd angularFront
npm install
npm build
cd ..
```

### 4. Running the Application
Start the services using Docker Compose:
```bash
docker-compose up --build
```

### 5. Access the Services
- **Discovery Service**: [http://localhost:8761](http://localhost:8761)
- **Config Service**: [http://localhost:9999](http://localhost:9999)
- **Gateway Service**: [http://localhost:8888](http://localhost:8888)
- **Product Service**: [http://localhost:8091](http://localhost:8091)
- **Client Service**: [http://localhost:8090](http://localhost:8090)
- **Sale Service**: [http://localhost:8092](http://localhost:8092)
- **Keycloak**: [http://localhost:8080](http://localhost:8080)
- **PgAdmin**: [http://localhost:8899](http://localhost:8899)
- **Angular Frontend**: [http://localhost](http://localhost)

## Endpoints

### Product Service
- `GET /api/products`: Get all products
- `POST /api/products`: Create a new product
- `PUT /api/products/{id}`: Update a product
- `DELETE /api/products/{id}`: Delete a product

### Client Service
- `GET /api/clients`: Get all clients
- `POST /api/clients`: Create a new client
- `PUT /api/clients/{id}`: Update a client
- `DELETE /api/clients/{id}`: Delete a client

### Sale Service
- `GET /api/sales`: Get all sales
- `POST /api/sales`: Create a new sale
- `PUT /api/sales/{id}`: Update a sale
- `DELETE /api/sales/{id}`: Delete a sale

## Technologies Used
- **Java 21**
- **Spring Boot**
- **Spring Cloud**
    - Eureka
    - Spring Cloud Config
    - Spring Cloud Gateway
- **Angular**
- **Docker**
- **Docker Compose**
- **PostgreSQL**
- **Keycloak**
- **PgAdmin**

