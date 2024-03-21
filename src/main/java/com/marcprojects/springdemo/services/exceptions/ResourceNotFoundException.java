package com.marcprojects.springdemo.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1l;
	
	public ResourceNotFoundException(Integer id){
		super(String.format("Resource with id %d not found", id));
	}
}
