package com.aks.app.model.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aks.app.model.entity.UserRole;

@Transactional
@Repository
public class UserRoleDAOImpl implements UserRoleDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void addUserRole(UserRole userRole) {
		hibernateTemplate.persist(userRole);
	}

}
