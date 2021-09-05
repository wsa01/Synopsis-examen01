package com.example.demo.exception;

public class crudException extends Exception {
	
	public crudException() {
		
	}
	public crudException(String message) {
		super(message);
	}
	public crudException (String message, Throwable cause) {
		super(message,cause);
	}
	public crudException (Throwable cause) {
		super(cause);
	}
	
}
