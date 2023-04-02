package com.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

public class BookingServlet extends HttpServlet 
{
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
		rd.forward(request, response);
	}
}
