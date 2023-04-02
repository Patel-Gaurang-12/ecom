package com.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import com.util.shortUserAsc;

import com.bean.userBean;

public class EcomUesrDao 
{
	static ArrayList<userBean> user = new ArrayList<userBean>();

	public static void addUser(userBean EcomUser)
	{
		user.add(EcomUser);
	}
	
	public static ArrayList<userBean> getAllData()
	{
		return user;
	}
	
	public static userBean login(String email, String password)
	{
		for(userBean usr : user)
		{
			if(usr.getEmail().equals(email) && usr.getPassword().equals(password))
			{
				return usr;
			}
		}
		return null;
	}
	
	public static void deleteUser(String email)
	{
		for(int i=0; i<user.size(); i++)
		{
			if(user.get(i).getEmail().equals(email))
			{
				user.remove(i);
				break;
			}
		}
	}
	
	public static userBean showUser(String email)
	{
		for(userBean usr : user)
		{
			System.out.println(usr.getEmail().trim().equals(email.trim()));
			if(usr.getEmail().trim().equals(email.trim()))
			{
				return usr;
			}
		}
		return null;
	}
	
	public static ArrayList<userBean> searchUser(String name)
	{
		ArrayList<userBean> alub = new ArrayList<userBean>();
		
		for(userBean ub : user)
		{
			String subName = ub.getFirstName().substring(0, name.length()).toLowerCase();
			if(subName.equals(name.toLowerCase()))
			{
				System.out.println("in search true" + subName);
				alub.add(ub);
			}
		}
		return alub;
	}
	
	public static ArrayList<userBean> AscendingOrderListUser()
	{
		 ArrayList<userBean> userList  = new ArrayList<>();
		 userList.addAll(user);
		 
		 Collections.sort(userList);
		
		return userList;
	}
}
