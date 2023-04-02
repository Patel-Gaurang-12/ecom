package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.bean.userBean;
import com.dao.EcomUesrDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EcomSearchServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("search");
		System.out.println(name);
		ArrayList<userBean> ub = EcomUesrDao.searchUser(name);
		
		request.setAttribute("list", ub);
		RequestDispatcher rd = request.getRequestDispatcher("ListSearch.jsp");
		rd.forward(request, response);	
	}
}
