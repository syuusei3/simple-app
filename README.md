# JavaToDo

# To-Do Application
 
To-Do Application using with Java+SpringBoot+PostgreSQL .

My IDE tool is "VS Code" .
 
# DEMO
 
You can learn how to develop simple application.
 


 

# Requirement
 
* JAVA ===v16.14.2
* SpringBoot ==
* PostgreSQL === Ver 8.0.28
 

 
```bash
java -version 
```
 
# Installation
 
## I

## Check Database
If you have not downloaded PostgreSQL
 

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

# Check table.
\dt;

# Check items contens.
select * from todo_items;
```

# Usage
 
 

 
# Note
 
I don't test environments under Linux and Mac.
 
# Author
 
* Shusei Sekiya

 

Thank you