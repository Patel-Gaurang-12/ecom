<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.bean.userBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Data</title>
</head>
<body>
	<%
		userBean usr = (userBean)request.getAttribute("user");
	%>
	First Name : ${user.firstName} <br>
	List Name : ${user.lastName} <br>
	Email : ${uesr.email} <br>
	Password : ${uesr.password} <br>
</body>
</html>