package com.example.demo.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.example.demo.beans.model.UserModel;
import com.example.demo.exception.crudException;
import com.example.demo.repository.IUserRepository;

@Repository
public class UserRespositoryImpl implements IUserRepository{
	
	
	private static Map<Integer, UserModel> users=new HashMap<>();
	
	@PostConstruct
	public void addData() {
		users.put(1, UserModel.builder().id(1).name("pedro").lastname("gg").phone("1233").password("132423").build());
	}
	
	@Override
	public List<UserModel> list() {
		// TODO Auto-generated method stub
		List<UserModel> result= new ArrayList<>();
		users.forEach((k,v)-> result.add(v));
		return result;
	}

	@Override
	public void add(UserModel user)  throws crudException{
		// TODO Auto-generated method stub
		int i=0;
		users.forEach((k,v)-> 
			{ 
				if(users.get(k).getPhone().compareTo(user.getPhone())==0) {
					System.out.print("repeated phone");
					
					//throw new crudException("repeated phone");
				}
			}
		);
		users.put(user.getId(), user);
	}

	@Override
	public void update(UserModel user) throws crudException{
		// TODO Auto-generated method stub
		if(users.get(user.getId())==null) {
			throw new crudException("Username does not exist");
		}
		users.put(user.getId(), user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		users.remove(id);
	}

	@Override
	public UserModel find(int id) throws crudException{
		// TODO Auto-generated method stub
		UserModel result= users.get(id);
		return result;
	}
	
	


	
}
