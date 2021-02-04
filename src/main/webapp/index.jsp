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
	margin-left: 20%;
	border: solid black 1px;
}
.form-group{
	justify-content: center;
	align-self: center;
}
	.reg{
		margin-left=50%;
		padding: 10dp;
	}
</style>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
		<h2>Login Page</h2>
		<hr>
	<div align="center">	
	
		<%
			if(request.getAttribute("error")!= ""){
				out.println( "<p class=' alert alert-danger'>" + request.getAttribute("error") +"</p>");
			}
			else
				out.println("");
		
		%>
	
		<form class="col-6 ml-50" action="login">
			<div class="form-group mt-4">
				<input class="form-control" type="text" name="user"
					placeholder="Enter Firstname" />
			</div>
			<div class="form-group mt-2">
				<input class="form-control" type="text" name="pass"
					placeholder="Enter Lastname" />
			</div>
			<button class="btn btn-success mb-4" href="Login">Login</button>
		</form>
		<h3>
			Not Registered? <a href="register.jsp">Sign Up</a>
		</h3>
	</div>
</body>
</html>
