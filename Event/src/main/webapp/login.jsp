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
        <form action="loginb1" method="post">
        <input type="hidden" id="status" value="<%= request.getAttribute("status")%>">
            <label for="uname">UserName:</label>
            <input type="text" placeholder="Enter Username" name="uname"><br><br>
            <label for="pswd">Password:</label>
            <input type="password" placeholder="Enter Minimum 8 character" name="pswd"><br><br>
            <button type="submit">click</button>
            <p>If not registered</p>
            <a href="register.jsp">Register</a>
        </form>
    </div>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	<script type="text/javaScript">
	var staus=document.getElementById("status").value;
	if(staus=="failed"){
		swal("sorry","username or password wrong","error");
	}
	</script>
</body>
</html>