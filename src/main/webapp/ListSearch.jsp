<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.bean.userBean,java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<userBean> ub = (ArrayList<userBean>)request.getAttribute("list"); 
	%>
	
	<table border="1">
		<tr>
			<th>First name</th>
			<th>Last name</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<%for(userBean usr : ub){ %>
			<tr>
				<td>	
					<%=usr.getFirstName()%>
				</td>
				<td>
					<%=usr.getLastName()%>
				</td>
				<td>
					<%=usr.getEmail()%>
				</td>
				<td>
					<%=usr.getPassword()%>
				</td>
			</tr>
		<%} %>
	</table>
</body>
</html>