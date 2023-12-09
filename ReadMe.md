# Overview

This sixth sprint i am aiming to getting to use Java along with Spring.

[Software Demo Video](https://youtu.be/4n4k3nVY9D8)

# Development Environment

For this project i am building a Rest API for a job/bug management .

- Create two entities namely User and Job/Bug
- Routing
- Hooking Database to JPA
- Creating Tables using JPA
- CRUD operations
- File structure
- Java syntax

# Useful Websites

* [Java](https://www.baeldung.com/spring-boot-sqlite)
* [Amigoscode](https://www.youtube.com/watch?v=9SGDpanrc8U&t=2593s)




# Job management rest api in Java(Spring) (Tracker)

In summary this Rest API, developers can seamlessly integrate either a Job Reporting Frontend or a Bug Reporting Frontend, sharing the same robust backend codebase. This versatile API ensures consistent and efficient management of tasks, jobs, and bugs across different user interfaces.

Our backend code provides a solid foundation, enabling developers to create tailored frontends that meet the specific requirements of job reporting or bug tracking. This approach maximizes code reusability, simplifies maintenance, and promotes a unified user experience.

Whether users are organizing tasks, reporting jobs, or tracking bugs, our API delivers a flexible and scalable solution. The shared backend ensures that improvements and updates benefit both frontends, creating a cohesive environment that enhances productivity, time management, and coordination of tasks and activities. Embrace the power of a unified API for comprehensive job and bug management.



### Deployment
Hosting (Render)



## General Info
General Information    
Operations RESTApi for day to day tasks.



## Technologies Used
    <dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>


		<dependency>
			<groupId>org.xerial</groupId>
			<artifactId>sqlite-jdbc</artifactId>
			<version>3.44.1.0</version>
		</dependency>

		<dependency>
			<groupId>org.hibernate.orm</groupId>
			<artifactId>hibernate-community-dialects</artifactId>
		</dependency>

		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>6.2.4.Final</version> <!-- Use the latest version -->
		</dependency>
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-spatial</artifactId>
			<version>6.2.4.Final</version>
		</dependency>  



## Setup
click marven reload project to download dependencies

click run 



## Project Status

### Project is: In development  

