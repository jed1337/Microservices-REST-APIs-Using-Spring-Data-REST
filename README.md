# Microservices REST APIs Using Spring Data REST
Code used in Kesha William's Building Microservices REST APIs Using Spring Data REST [Pluralsight course](https://app.pluralsight.com/library/courses/e3623113-f5f3-4881-a190-cd4feea26f9b/table-of-contents).

The original code can be found at her [Gitlab repository](https://gitlab.com/videolearning/bugtracker).

## Changes from the original code
A `pom.xml` file was added in each of the microservices so that Intellij will detect them as separate modules.

The project structure for each microservice is as follows (when applicable):

|Folder type | Path|
|---|---|
|Source Folders | src\main\java|
|Test Source Folders | src\test\main\java|
|Resources Folders | src\main\resources|
|Excluded Folders | target| 

## Information
The application is split into three microservices: TicketManagement, ApplicationCatalog, and UserManagement.

Each microservice is ran on a different port and has its own H2 In Memory database.

We initialise the contents of the H2 database from `onApplicationEvent(ContextRefreshedEvent)` from each microservice. 

> On either initializing or refreshing the ApplicationContext, Spring raises the ContextRefreshedEvent. Typically a refresh can get triggered multiple times as long as the context has not been closed
-[Baeldung](https://www.baeldung.com/spring-context-events).

## H2 credentials
|Field | Value|
|---|---|
|jdbc url | jdbc:h2:mem:testdb|
|Username | sa|
|Password | (empty)|

## Usage
Start all three microservices. Their data can then be accessed via Postman.

* TicketManagement
    * Port: 8080
    * H2 Console: http://localhost:8080/console

* ApplicationCatalog
    * Port: 8081
    * H2 Console: http://localhost:8081/console

* UserManagement
    * Port: 8082
    * H2 Console: http://localhost:8082/console

