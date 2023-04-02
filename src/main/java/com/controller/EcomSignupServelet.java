package com.controller;

import java.io.IOException;

import com.bean.userBean;
import com.dao.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EcomSignupServelet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		userBean ub = new userBean(firstName, lastName, email, password, 1);
		EcomUesrDao.addUser(ub);
		
		RequestDispatcher rd = request.getRequestDispatcher("ecomSignup.jsp");
		rd.forward(request, response);
	}
}
