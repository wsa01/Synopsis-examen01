package com.example.demo.beans.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

	private int id;
	private String name;
	private String lastname;
	private String phone;
	private String password;
}
