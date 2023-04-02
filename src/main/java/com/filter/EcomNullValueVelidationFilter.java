package com.filter;

import java.io.IOException;

import com.util.Velidators;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class EcomNullValueVelidationFilter implements Filter 
{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		boolean isErorr = false;
		
		if(Velidators.isNull(firstName))
		{
			isErorr = true;
			request.setAttribute("fNameError", "Please, Enter the First name");
		}
		
		if(Velidators.isNull(lastName))
		{
			isErorr = true;
			request.setAttribute("lNameError", "Please, Enter the Last name");
		}
		
		if(Velidators.isNull(email))
		{
			isErorr = true;
			request.setAttribute("emailError", "Please, Enter the Email");
		}
		
		if(Velidators.isNull(password))
		{
			isErorr = true;
			request.setAttribute("passwordError", "Please, Enter the Password");
		}
		
		if(isErorr)
		{
			RequestDispatcher rd = request.getRequestDispatcher("ecomSignup.jsp");
			rd.forward(request, response);
		}
		else 
		{
			chain.doFilter(request, response);
		}
	}
}
