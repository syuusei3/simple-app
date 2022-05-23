# JavaToDo

# To-Do Application
 
To-Do Application using with Java+SpringBoot+PostgreSQL .

My IDE tool is "VS Code" .
 
# DEMO
 
You can learn how to develop simple application on Windows.
 
 
 ![](https://media.github.tools.sap/user/54379/files/4dc05f71-38d8-4ab2-9c70-c68f6d6708ec)
 

# Requirement
 
* JAVA === openjdk 11.0.14.1 
* SpringBoot === 2.6.7
* PostgreSQL === Ver 8.0.28

 
```bash
java -version 
```
 
# Installation

## Check environment

You need to add the following elements to your pom.xml.

```bash
・Spring Web 
・Spring Boot DevTools 
・Thymeleaf 
・Lombok 
・MyBatis Framework 
・PostgreSQL Driver
```

## Check Database
If you have not downloaded PostgreSQL.
(https://www.postgresql.org/)
 
Please remember your pssowrd.


```bash
# Go into PostgreSQL, postgres is original user.
psql -U postgres


# Check existence database.
\l

# Create todo_db Database.
CREATE DATABASE todo_db;

# select todo_db Database.
\connect todo_db
or
\c todo_db


# Create todo_db's table.

CREATE DATABASE todo_items(
    id serial,
    title varchar(40),
    content varchar(300)
);

# Check tables.
\dt;

# Check items contens.
select * from todo_items;
```

# Usage
Run on VSCode.
 

 
# Note
 
I did not test environments under Linux and Mac.
 
# Author
 
* Shusei Sekiya

 

Thank you