package com.aks.app.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aks.app.model.dao.UserRoleDAOImpl;
import com.aks.app.model.entity.UserRole;
@Service
public class UserRoleServiceImpl implements UserRoleService{

	@Autowired
	private UserRoleDAOImpl userRoleDAOImpl;
	
	@Override
	public void addUserRole(UserRole userRole) {
		userRoleDAOImpl.addUserRole(userRole);
	}

}
