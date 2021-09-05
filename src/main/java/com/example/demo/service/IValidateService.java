package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.beans.model.UserModel;

@Component
public interface IValidateService {
	
	public boolean validate(UserModel user);
	
}
