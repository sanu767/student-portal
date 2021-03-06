package com.skmm.app.example.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.skmm.app.example.model.User;

public class UserDAOImpl extends HibernateDaoSupport  implements UserDAO{
	
	@Override
	public User findByCode(String code) {
		List findByNamedQuery = getHibernateTemplate().loadAll(User.class);
		System.out.println(findByNamedQuery);
		return (User) findByNamedQuery.get(0);
	}

}
