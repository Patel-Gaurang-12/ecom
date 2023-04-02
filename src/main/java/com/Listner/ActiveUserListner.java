package com.Listner;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class ActiveUserListner implements HttpSessionListener
{
	private static int activeUser = 0; 
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		 activeUser++;
		 System.out.println("active user is : " + activeUser);
	} 
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		activeUser--;
		 System.out.println("active user is : " + activeUser);
	}
}
