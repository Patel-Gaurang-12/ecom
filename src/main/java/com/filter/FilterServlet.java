package com.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FilterServlet implements Filter 
{
	@Override
	public void doFilter(ServletRequest request, ServletResponse responce, FilterChain chain)
			throws IOException, ServletException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		boolean isError = false;
		if(name == null || name.trim().length() == 0)
		{
			isError = true;
			request.setAttribute("nameError", "Please, Enter the name.");
		}
		
		if(email == null || email.trim().length() == 0)
		{
			isError = true;
			request.setAttribute("emailError", "Please, Enter the Email.");
		}
		
		if(isError)
		{
			RequestDispatcher rd = request.getRequestDispatcher("Booking.jsp");
			rd.forward(request, responce);
		}
		else
		{
			chain.doFilter(request, responce);
		}
	}
}
