package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public interface IBcryptService {

	public String encrypt(String password);
}
