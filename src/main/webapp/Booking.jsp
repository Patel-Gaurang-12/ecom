<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String nameErr = (String) request.getAttribute("nameError");
		String emailErr = (String) request.getAttribute("emailError");
	%>

	<form action="BookingServlet" method="post">
	
		<label>Name : </label>
		<input type="text" name="name"> <br>
		<%= nameErr == null ? "" : nameErr %> <br>
		<label>Email : </label>
		<input type="text" name="email"> <br>
		<%= emailErr == null ? "" : emailErr %> <br>
		<button type="submit">BOOKING</button>
	</form>
</body>
</html>