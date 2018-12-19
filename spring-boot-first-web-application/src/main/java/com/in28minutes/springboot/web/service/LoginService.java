package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validUser(String userName, String password) {
		return userName.equalsIgnoreCase("in28minutes") && password.equalsIgnoreCase("dummy");
	}
}
