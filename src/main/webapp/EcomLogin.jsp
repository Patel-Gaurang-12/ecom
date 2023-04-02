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
		String email = (String)request.getAttribute("emailError");
		String pass = (String)request.getAttribute("passError");
	%>

	<form action="EcomLoginServlet" method="post">
		<label>Email</label> <br>
		<input type="text" name="email"> <br>
		<%=email == null ? "" : email %> <br>
		<label>Password</label> <br>
		<input type="text" name="password"> <br>
		<%=pass == null ? "" : pass %> <br>
		<button type="submit">LOGIN</button>
	</form>
</body>
</html>