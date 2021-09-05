package com.example.demo.service;

import java.util.List;

import com.example.demo.beans.model.UserModel;
import com.example.demo.exception.crudException;

public interface IUserService {

	public List<UserModel> list();
	public void add(UserModel user)  throws crudException;
	public void update(UserModel user)throws crudException;
	public void delete(int id);
	public UserModel find(int id)throws crudException;
}
