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

public class AscendingOrderDataListServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EcomUesrDao userDao = new EcomUesrDao();
		ArrayList<userBean> users = userDao.AscendingOrderListUser();

		request.setAttribute("list", users);
		request.getRequestDispatcher("AscendingOrderDataList.jsp").forward(request, response);
	}
}
