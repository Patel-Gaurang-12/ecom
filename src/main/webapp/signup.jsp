<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>
	<% 
		String nameErr = (String) request.getAttribute("nameErorr");
		String mailErr = (String) request.getAttribute("mailErorr");
		String passErr = (String) request.getAttribute("passErorr");
	%>
	<form action="signup" method="post">
		<input type="text" name="fname" placeholder="First name"> <br>
		<%= nameErr == null ? "" : nameErr %> <br>
		<input type="text" name="mail" placeholder="E-mail"> <br>
		<%=mailErr == null ? "" : mailErr %> <br>
		<input type="password" name="password" placeholder="Password"> <br>
		<%=passErr == null ? "" : passErr %> <br>
		<button type="submit"> Signup </button>
	</form>
</body>
</html>