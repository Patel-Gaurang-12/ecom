package com.util;

import java.util.Comparator;
import java.util.stream.Collector;

import com.bean.userBean;

public class shortUserAsc implements Comparator<userBean>
{
	@Override
	public int compare(userBean user1, userBean user2) {
		return user1.getFirstName().compareTo(user2.getFirstName());
	}	
}
