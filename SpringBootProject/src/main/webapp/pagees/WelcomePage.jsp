<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h2>Welcome to our Spring boot project!!</h2>
<h3>Please select the id</h3>
<form action="getDetails" method="post">
<input type=number name=id />
<input type=submit value=search />
</form>
</body>
</html>