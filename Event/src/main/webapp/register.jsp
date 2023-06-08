<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<form action="registerb" method="post">
    <div class="register">
    	<input type="hidden" id="status" value="<%= request.getAttribute("status")%>">
        <label for="fname">First Name:</label>
        <input type="text" placeholder="Enter First Name" name="fname"><br><br>
        <label for="lname">Last Name:</label>
        <input type="text" placeholder="Enter last name" name="lname"><br><br>
        <label for="Phnum">Phone Number:</label>
        <input type="number" placeholder="Enter 10 digit number" name="Phnum"><br><br>
        <label for="Email">Email:</label>
        <input type="email" placeholder="Enter Your Email Id" name="Email"><br><br>
        <label for="pswd">Password</label>
        <input type="password" placeholder="Enter atleast 8 input" name="pswd"><br><br>
        <button type="reset">Reset</button><br><br>
       <input type="submit" value ="done"><br><br>
        <option value="checkbox"></option>
        <p>If already registerd</p>
        <a href="login.jsp">Login</a>
    </div>
    </form>
    <script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	<script type="text/javaScript">
	var staus=document.getElementById("status").value;
	if(staus=="success"){
		swal("congrats","account successfully created","success");
	}
	</script>
</body>
</html>