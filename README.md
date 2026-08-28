# TaskFlow Microservices

![Java](https://img.shields.io/badge/Java-25-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.1.1-6DB33F?style=flat&logo=springboot&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-4.1.0-6DB33F?style=flat&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8-4479A1?style=flat&logo=mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=flat&logo=apachemaven&logoColor=white)
![Status](https://img.shields.io/badge/Status-Work_in_progress-F4A7B9?style=flat)

Task management application developed as a hands-on learning project with Java and Spring Boot.

The project is currently in an early development stage and will progressively evolve towards a microservices-based architecture as new concepts and technologies are implemented.

> 🚧 This repository is a work in progress and will be updated regularly throughout its development.

## Current stack

- Java 25
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- MySQL
- Maven

## Current focus

The current development phase focuses on building the core task management functionality and connecting the application to a relational database using Spring Data JPA.

## Planned development

As the project evolves, it is expected to include:

- separation of functionality into independent services
- communication between microservices
- REST API development
- containerization with Docker
- additional configuration and service-management tools

The contents of this section may change as the project progresses.

## Configuration

The application uses MySQL as its relational database.

For security reasons, the database password is not stored in the repository. It must be provided through the following environment variable:

```text
DB_PASSWORD