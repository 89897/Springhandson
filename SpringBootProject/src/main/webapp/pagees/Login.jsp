<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<body>
<div >
<h1>Welcome to Spring Boot Site!!</h1>
</div>
<h2>Please SignUp First Below</h2>
<form action="fetchDetails" method="post">

<label>Enter Id</label>
<input type=text name=id />
<br>
<label>Enter Name</label>
<input type=text name=name />
<br>
<label>Enter email</label>
<input type=text name=email />
<br>
<label>Enter Password</label>
<input type=password name=pass />
<br>
<input type=submit value=submit />

</form>
</body>
</html>