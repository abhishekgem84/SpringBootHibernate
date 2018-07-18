package com.aks.app.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aks.app.model.dao.RegistrationDAO;
import com.aks.app.model.entity.RegisteredUser;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	private RegistrationDAO registrationDAO;
	
	@Override
	public void addRegistration(RegisteredUser registeredUser) {
		
		registrationDAO.addRegistration(registeredUser);
	}

}
