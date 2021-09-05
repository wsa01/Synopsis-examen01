package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.beans.model.UserModel;
import com.example.demo.exception.crudException;

@Component
public interface IUserRepository {

	public List<UserModel> list();
	public void add(UserModel user)  throws crudException;
	public void update(UserModel user) throws crudException;
	public void delete(int id);
	public UserModel find(int id) throws crudException;
}
