package com.controller;

import java.io.IOException;

import com.bean.userBean;
import com.dao.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EcomLoginServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		userBean user = EcomUesrDao.login(email,password);
		RequestDispatcher rd = null;
		if(user==null)
		{
			request.setAttribute("emailError", "Invalid Email.");
			request.setAttribute("passError", "Invalid Password.");
			rd = request.getRequestDispatcher("EcomLogin.jsp");
		}
		else 
		{
			rd = request.getRequestDispatcher("EcomHome.jsp");
		}
		rd.forward(request, response);
	}
}
