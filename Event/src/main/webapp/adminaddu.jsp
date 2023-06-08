<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <style>
        body{
            margin: 0px 50px;
            padding: 50px;
            background-color: black;
            background-image: url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWkdoqGZ7HmK3jJ9gLSjBWP2wtLo0GcolVxA&usqp=CAU);
            background-repeat: no-repeat;
            background-size: 100%;
        }

        .register{
            background-color: aliceblue;
            opacity: 50%; 
            padding: 50px 200px;
            margin: 60px 150px;
        }
    </style>
</head>
<body>
<form action="adminaddb" method="post">
    <div class="register">
    	
        <label for="up">insert or update</label>
        <input type="text" placeholder="Enter First Name" name="up"><br><br>
           <label for="upval">enter the events here</label>
        <input type="text" placeholder="Enter First Name" name="upval"><br><br>
       <input type="submit" value ="done"><br><br>
        
    </div>
    </form>
    
</body>
</html>