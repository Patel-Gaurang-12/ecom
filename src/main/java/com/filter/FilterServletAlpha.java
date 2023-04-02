package com.filter;

import java.io.IOException;

import com.util.Velidators;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FilterServletAlpha implements Filter 
{

	@Override
	public void doFilter(ServletRequest request, ServletResponse responce, FilterChain chain)
			throws IOException, ServletException {
		
		String name = request.getParameter("name");
		String mail = request.getParameter("email");
		
		boolean isError = false;
		System.out.println("In alpha filter");
		if(!Velidators.isName(name))
		{
			isError = true;
			request.setAttribute("nameError", "Invalid name, Please enter valid name.");
		}
		
		if(!Velidators.isMail(mail))
		{
			isError = true;
			request.setAttribute("emailError", "Invalid email, Please enter valid email.");
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
