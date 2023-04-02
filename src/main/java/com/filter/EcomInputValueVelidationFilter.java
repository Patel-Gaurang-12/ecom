package com.filter;

import java.io.IOException;

import com.util.Velidators;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class EcomInputValueVelidationFilter implements Filter 
{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		boolean isErorr = false;
		if(!Velidators.isName(firstName))
		{
			isErorr = true;
			request.setAttribute("fNameError", "Please, Enter Valid First name");
		}
		
		if(!Velidators.isName(lastName))
		{
			isErorr = true;
			request.setAttribute("lNameError", "Please, Enter Valid Last name");
		}
		
		if(!Velidators.isMail(email))
		{
			isErorr = true;
			request.setAttribute("emailError", "Please, Enter Valid Email");
		}
		
		if(!Velidators.isPass(password))
		{
			isErorr = true;
			request.setAttribute("passwordError", "Please, Enter Valid Password");
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
