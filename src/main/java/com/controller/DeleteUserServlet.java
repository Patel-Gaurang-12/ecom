package com.controller;

import java.io.IOException;
import com.dao.EcomUesrDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteUserServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email = request.getParameter("email");
		EcomUesrDao.deleteUser(email);
		
		RequestDispatcher rd = request.getRequestDispatcher("EcomLandingPage");
		rd.forward(request, response);
	}
}
