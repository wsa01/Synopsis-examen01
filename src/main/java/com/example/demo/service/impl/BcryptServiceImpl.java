package com.example.demo.service.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.service.IBcryptService;

@Service
public class BcryptServiceImpl implements IBcryptService {

	@Override
	public String encrypt(String password) {
		// TODO Auto-generated method stub
		String encode=new BCryptPasswordEncoder().encode(password);
		return encode;
	}

	
}
