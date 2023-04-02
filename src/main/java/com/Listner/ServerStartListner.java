package com.Listner;

import com.dao.EcomUesrDao;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import com.bean.userBean;

public class ServerStartListner implements ServletContextListener 
{
	public void contextInitialized(ServletContextEvent sce) 
	{
		System.out.println("server starts");

		userBean ub1 = new userBean("Gaurang", "patel", "gaurang!gmail", "sdfad", 12);
		EcomUesrDao.addUser(ub1);

		userBean ub2 = new userBean("Ram", "sita", "ram@gmail", "ram12", 10);
		EcomUesrDao.addUser(ub2);

		userBean ub3 = new userBean("vibhisan", "ravan", "vibhisan@gmail", "vibhishan12", 5);
		EcomUesrDao.addUser(ub3);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) 
	{
		System.out.println("server Destroyed");
	}
}
