package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.beans.model.UserModel;
import com.example.demo.service.IValidateService;

@Service
public class ValidateServiceImpl implements IValidateService {
	
	
	@Override
	public boolean validate(UserModel user) {
		// TODO Auto-generated method stub
		
		if(user.getName()=="" || user.getLastname()=="" || user.getPhone()=="" || user.getPassword()==""||
		   user.getName()==null || user.getLastname()==null || user.getPhone()==null || user.getPassword()==null) {
			return false;
		}else {return true;}
	}

	
	
}
