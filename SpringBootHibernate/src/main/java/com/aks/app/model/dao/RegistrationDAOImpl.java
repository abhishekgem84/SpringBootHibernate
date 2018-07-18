package com.aks.app.model.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aks.app.model.entity.RegisteredUser;

@Transactional
@Repository
public class RegistrationDAOImpl implements RegistrationDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void addRegistration(RegisteredUser registeredUser) {
		hibernateTemplate.persist(registeredUser);

	}

}
