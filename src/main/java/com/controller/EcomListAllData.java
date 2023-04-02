package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import com.bean.userBean;
import com.dao.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EcomListAllData extends HttpServlet 
{
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ArrayList<userBean> user = userBean.getData();
		request.setAttribute("users", user);
		RequestDispatcher rd = request.getRequestDispatcher("EcomLandingPage.jsp");
		rd.forward(request, response);
	}
}
