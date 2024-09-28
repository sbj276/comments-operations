# comments-operations
to perform operations on comment database


28 September 2024
11:22

Objective: 
Create a RESTful API using Java Spring Boot to manage comments. The API should allow retrieving all comments and provide search functionality by username and date. 
Features: 
		1.      Retrieve all comments: Endpoint to fetch all comments. 
		2.      Search by username: Allow filtering comments by username. 
		3.      Search by date: Allow filtering comments by date. 
		4.      POST 
		5.      PUT 
		6.      DEL 
Technologies Used: 
		·       Java Spring Boot 
		·       Spring Data JPA 
		·       Maven 
API Endpoints: 
Endpoint 	Method 	Description 
/api/v2/comments 	GET 	Retrieve all comments 
/api/v2/comments/search?username={username} 	GET 	Retrieve comments by username 
/api/v2/comments/search?date={date} 	GET 	Retrieve comments by date 
 
 
MySQL schema for the Comments table based on the provided model: 

CREATE TABLE Comments ( ID BIGINT AUTO_INCREMENT PRIMARY KEY, By VARCHAR(255) NOT NULL, Text TEXT NOT NULL, dateofcomment DATETIME NOT NULL );  

This schema creates a table named Comments with the following columns: 
		·       ID: A unique identifier for each comment, automatically incremented. 
		·       By: The username or name of the commenter. 
		·       Text: The content of the comment. 
·       dateofcomment: The date and time when the comment was posted. 




## DDL

CREATE TABLE Comments ( 
ID BIGINT AUTO_INCREMENT PRIMARY KEY, 
Byuser VARCHAR(255) NOT NULL, 
Text TEXT NOT NULL, 
dateofcomment DATETIME NOT NULL 
);