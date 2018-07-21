package com.aks.app.controller;

import javax.jws.WebMethod;

import org.springframework.stereotype.Component;
@Component
@javax.jws.WebService(serviceName = "WService")
public class WebService {
	@WebMethod
	public String welcome() {
		return "Welcome";
	}
}
