## Provider
This is a sample Spring Boot application that serves as a provider. It uses **Spring Boot 3.0.5**, and provides a RESTful API endpoint.

## Requirements
Java 17 or later

Maven

## Build and Run

To build and run the application, follow these steps:

* Clone the repository to your local machine.
* Navigate to the project root directory.
* Run mvn spring-boot:run to start the application.
* The application will start on port 8080 by default.

## API
The application exposes a single RESTful API endpoint:

**GET** */products*: Returns a list of products.

**GET** */products/id*: Returns a product with id.

**GET** */category*: Returns a list of category.


# Testing

To run the unit tests, use the following command:

```bash 
mvn test
```

## Version
The current version of the application is 0.0.1-SNAPSHOT.

## Dependencies
The following dependencies are used in this application:

* Spring Boot 3.0.5
* Spring Boot Starter Web
* Project Lombok
* Spring Boot Starter Test
* Spring Security Test

## License
This project is licensed under the MIT License - see the LICENSE.md file for details.
