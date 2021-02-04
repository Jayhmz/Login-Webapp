<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login App</title>

<style>
h2{
	justify-content: center;
}
.forms{
	margin-left: 40%;
}
	.reg{
		margin-left=50%;
		padding: 10dp;
	}
</style>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
		Hey! <%= session.getAttribute("username") %> you are welcome....
</body>
</html>
