<%@page import="com.bean.userBean"%>
<%@page import="java.util.ArrayList"%>
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
		ArrayList<userBean> user = (ArrayList<userBean>)request.getAttribute("list");	
	%>

	<table border="1">
		<tr>
			<th>First name</th>
			<th>Last name</th>
			<th>Email</th>
			<th>Password</th>
			<th>action</th>
		</tr>
		<%for(userBean usr : user){ %>
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
				<td> 
					 <a href="DeleteUserServlet?email=<%=usr.getEmail()%>">Delete</a> 
					 <a href="ViewUserServlet?email=<%=usr.getEmail()%>">View</a>
				</td>
			</tr>
		<%} %>
	</table>

</body>
</html>