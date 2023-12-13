# Spring boot deployment

this project aims for deploying the spring boot with docker compose stack, using CRUD REST API, Hibernate, PostgreSQL, and Docker.

# Jenkins use

- get username(admin) and password (cat /var/jenkins_home/secrets/initialAdminPassword) after docker compose up
- manage Jenkins => add plugin => tool => system SSH =>

# Dependencies

```
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
    	<groupId>org.projectlombok</groupId>
    	<artifactId>lombok</artifactId>
    	<version>1.18.30</version>
		</dependency>
</dependencies>
```
