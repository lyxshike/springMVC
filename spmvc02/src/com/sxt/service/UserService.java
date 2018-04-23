package com.sxt.service;

import org.springframework.stereotype.Service;

import com.sxt.dao.UserDao;
import com.sxt.po.User;
@Service
public class UserService {
	
	private UserDao userDao;
	
	public void add(String uname){
		System.out.println("UserService.add()");
		User u = new User();
		u.setUname(uname);
		userDao.add(u);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}