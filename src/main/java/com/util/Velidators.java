package com.util;

public class Velidators 
{
	public static boolean isNull(String str) 
	{
		return str.trim().length() == 0;
	}
	
	public static boolean isName(String str) 
	{
		return str.trim().matches("[a-zA-Z]+");
	}
	
	public static boolean isMail(String str)
	{
		return str.trim().matches("[a-zA-Z]+");
	}
	
	public static boolean isPass(String str)
	{
		return str.trim().matches("[0-9a-zA-Z@-]+");
	}
}
