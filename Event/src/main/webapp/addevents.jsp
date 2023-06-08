<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <style>
        body{
            background-color: grey;
            background-image: url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRA6xI4Hw3Kv4Dd0P06gdT058DplHcKFMdOxQ&usqp=CAU);
            background-repeat: no-repeat;
            background-size: 100%;
        }

        .form{
            background-color: white; 
            opacity: 50%;
            font-size: 20px;
            color: black;
            margin-right: 400px;
            margin-left: 400px;
            margin-top: 200px;
            padding: 50px 50px;
            border: 5px;
            border-color: aqua;
            

        }

        a{
            color: red;
        }

        button:after{
            transition: ease-in-out;
        }

        /* .re{ */
            /* margin: 150px auto; */
        /* } */

       
    </style>
</head>
<body>
    <!-- <div class="re"></div> -->
    <div class="form">
        <form  action="eventsback"method="post">
       
            <label for="uname1">adminName:</label>
            <input type="text" placeholder="Enter Username" name="uname1"><br><br>
            <label for="pswd1">Password:</label>
            <input type="password" placeholder="Enter Minimum 8 character" name="pswd1"><br><br>
            <button type="submit">click</button>
           
        </form>
    </div>
    
</body>
</html>