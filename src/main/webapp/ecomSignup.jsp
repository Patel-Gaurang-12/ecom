<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-commerce Signup </title>
</head>
<body>
	
	<%
		String fnameError = (String) request.getAttribute("fNameError");
		String lnameError = (String) request.getAttribute("lNameError");
		String email = (String) request.getAttribute("emailError");
		String password = (String) request.getAttribute("passwordError");
	%>

	<form action="EcomSignupServelet" method="post">
		<label>First name : </label> <br>
		<input type="text" name="firstName"> <br>
		<%=fnameError == null ? "" : fnameError %> <br>
		
		<label>Last name : </label> <br>
		<input type="text" name="lastName"> <br>
		<%=lnameError == null ? "" : lnameError %> <br>
		
		<label>E-mail : </label> <br>
		<input type="text" name="email"> <br>
		<%=email == null ? "" : email %> <br>
		
		<label>Password : </label> <br>
		<input type="password" name="password"> <br>
		<%=password == null ? "" : password %> <br>
		
		<button type="submit">SUBMIT</button>
	</form>
	
	<a href="EcomLandingPage">Get All users</a> <br>
	<a href="EcomLoginServlet">Login</a> <br>
	<a href="AscendingOrderDataListServlet">Ascending Order Data List</a> <br>
	<a href="EcomSearchUser.jsp">Search Users</a> <br>
</body>
</html>