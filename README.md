# Food Ordering System

A RESTful backend application built using Spring Boot, Hibernate, JPA, and MySQL for managing food orders.

## Features

- Create a new order
- View all orders
- Get order by ID
- Update order details
- Delete an order
- Manage order status

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

## Project Structure

src
├── controller
├── service
├── repository
├── entity
└── exception

## Entity

Order

| Field | Type |
|---------|---------|
| orderId | Long |
| customerName | String |
| foodItem | String |
| quantity | Integer |
| totalAmount | Double |
| orderDate | LocalDate |
| orderStatus | String |

## API Endpoints

| Method | Endpoint | Description |
|----------|----------|----------|
| POST | /orders | Create Order |
| GET | /orders | Get All Orders |
| GET | /orders/{id} | Get Order By ID |
| PUT | /orders/{id} | Update Order |
| DELETE | /orders/{id} | Delete Order |

## Database Configuration

Update the following properties in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/fooddb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Running the Project

1. Clone the repository

```bash
git clone https://github.com/saivardhan1245/springboot-food-ordering-system.git
```

2. Navigate to the project folder

```bash
cd springboot-food-ordering-system
```

3. Run the application

```bash
mvn spring-boot:run
```

## Learning Outcomes

- Spring Boot REST APIs
- Hibernate ORM
- JPA Repository
- CRUD Operations
- MySQL Integration
- Layered Architecture

## Author

Sai Vardhan