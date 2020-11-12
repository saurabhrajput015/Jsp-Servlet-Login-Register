<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<body>
	<div class="container">
	<h1>Employee Directory</h1>
	<hr/>
		<div class="row">

			<div class="col-md-4">
				<form action="/RegisterController"
					method="POST">
					<div class="form-group">
						<input type="text" name="name" value="${register.name}"
						placeholder="Enter Name" class="form-control" /><br />
					</div>
					<div class="form-group">
						<input type="text" name="email" value="${register.email}"
							placeholder="Enter Email" class="form-control" /><br />
					</div>
					<div class="form-group">
						<input type="password" name="password"
							value="${register.password}" placeholder="Enter Password"
							class="form-control" /><br />
					</div>
					<input type="hidden" value="${register.id}" name="id" />
					<button class="btn btn-primary" type="submit">Save
						Employee</button>
				</form>
			</div>
		</div>

	</div>

</body>
</html>