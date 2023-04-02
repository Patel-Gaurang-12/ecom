package com.bean;

import java.util.ArrayList;
import java.util.Comparator;

import com.dao.*;

public class userBean  implements Comparable<userBean>{
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int role;
	
	public userBean() {}
	public userBean(String firstName, String lastName, String email, String password, int role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	
	public static ArrayList<userBean> getData()
	{
		return EcomUesrDao.getAllData();
	}

	@Override
	public int compareTo(userBean o) {
		if(this.firstName.compareTo(o.firstName) > 0 ) {
			//+
			return 1; 
		}else if(this.firstName.compareTo(o.firstName) < 0 ) {
			return -1;
		}else {
			return 0;
		}
		//return this.firstName.compareTo(o.firstName);
	}
}
