package com.controller;

import java.io.IOException;
import com.bean.userBean;
import com.dao.EcomUesrDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewUserServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email = request.getParameter("email");
		userBean user = EcomUesrDao.showUser(email);
		System.out.println(user.getEmail());
		
		request.setAttribute("user", user);
		RequestDispatcher rd = request.getRequestDispatcher("ListUserData.jsp");
		rd.forward(request, response);
	}
	
}
