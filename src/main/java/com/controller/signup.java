package com.controller;

import com.util.Velidators;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class signup extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest requset, HttpServletResponse responce) throws ServletException, IOException 
	{
		String name = requset.getParameter("fname");
		String mail = requset.getParameter("mail");
		String pass = requset.getParameter("password");
		
		String isNameErr = "";
		String isMailErr = "";
		String isPassErr = "";
		boolean isErorr = false;
		
		System.out.println(name);
		System.out.println(mail);
		System.out.println(pass);
		
		if(Velidators.isNull(name))
		{
			isErorr = true;
			requset.setAttribute("nameErorr", "Please enter the Name");
		}
		
		if(Velidators.isNull(mail))
		{
			isErorr = true;
			requset.setAttribute("mailErorr", "Please enter the Mail");
		}
		else 
		{			
			if(!Velidators.isMail(mail))
			{
				isErorr = true;
				requset.setAttribute("mailErorr", "Please enter the Valid Mail");
			}
		}
		
		
		if(Velidators.isNull(pass))
		{
			isErorr = true;
			requset.setAttribute("passErorr", "Please enter the Password");
		}
		else 
		{
			if(!Velidators.isPass(pass))
			{
				isErorr = true;
				requset.setAttribute("passErorr", "Please enter the valid Password");
			}			
		}
		
		RequestDispatcher rd = null;
		if(isErorr)
		{
			rd = requset.getRequestDispatcher("signup.jsp");
		}
		else
		{
			rd = requset.getRequestDispatcher("home.jsp");
		}
		rd.forward(requset, responce);
	}
}