package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.model.UserModel;
import com.example.demo.exception.crudException;
import com.example.demo.repository.IUserRepository;
import com.example.demo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserRepository repo;
	
	@Override
	public List<UserModel> list() {
		// TODO Auto-generated method stub
		return repo.list();
	}

	@Override
	public void add(UserModel user)  throws crudException{
		// TODO Auto-generated method stub
		repo.add(user);
	}

	@Override
	public void update(UserModel user) throws crudException{
		// TODO Auto-generated method stub
		repo.update(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.delete(id);
	}

	@Override
	public UserModel find(int id) throws crudException{
		// TODO Auto-generated method stub
		return repo.find(id);
	}

	

}
