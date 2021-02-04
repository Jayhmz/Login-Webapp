<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login App</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
		
		<div align="center">
	<div class="col-6 border border-success p-5">
		<form method="post" >
			<div class="form-group mt-4"><input class="form-control" type="text" name="firstname" placeholder="Enter Firstname"/></div>
			<div class="form-group"><input class="form-control" type="text" name="lastname" placeholder="Enter Lastname"/></div>
			<div class="form-group"><input class="form-control" type="email" name="email" placeholder="Enter Email"/></div>
			<div class="form-group"><input class="form-control" type="phone" name="phone" placeholder="Phone Number"/></div>
			<div class="form-group"><input class="form-control" type="text" name="username" placeholder="Enter Preffered Username"/></div>
			<div class="form-group"><input class="form-control" type="password" name="password" placeholder="Enter Password"/></div>
			<div class="form-group"><input class="form-control" type="password" name="password" placeholder="Confirm Password"/></div>
			
			<button class="btn btn-success mb-4" href="registerServlet">Register</button>
		</form>
	</div>
	</form>
</div>
</body>
</html>
