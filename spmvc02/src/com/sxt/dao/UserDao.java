package com.sxt.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sxt.po.User;
@Repository
public class UserDao {
	private HibernateTemplate hibernateTemplate;
	
	public void add(User u){
		System.out.println("UserDao.add()");
		hibernateTemplate.save(u);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}