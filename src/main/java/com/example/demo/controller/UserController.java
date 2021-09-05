package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.model.UserModel;
import com.example.demo.exception.crudException;
import com.example.demo.service.IBcryptService;
import com.example.demo.service.IUserService;
import com.example.demo.service.IValidateService;
	

@RestController
public class UserController {
	
	@Autowired
	private IUserService service;
	@Autowired
	private IBcryptService bcrypt;
	@Autowired
	private IValidateService val;
	
	@GetMapping
	public ResponseEntity<?> list(){
		List<UserModel> result=service.list();
		return ResponseEntity.ok().body(result);
	}
	
	@PostMapping
	public ResponseEntity<?> add(@RequestBody UserModel user) throws crudException {
		
		boolean valor=val.validate(user);
		
		if(valor) {
			String passEncrypt= bcrypt.encrypt(user.getPassword());
			user.setPassword(passEncrypt);
			service.add(user);
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.badRequest().build();
			}
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody UserModel user) throws crudException {
		service.update(user);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping(path = "{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping(path = "{id}")
	public ResponseEntity<?> find(@PathVariable int id) throws crudException{
		UserModel result= service.find(id);
		return ResponseEntity.ok().body(result);
	}
	

	
	
}
