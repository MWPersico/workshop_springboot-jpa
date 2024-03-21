package com.marcprojects.springdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcprojects.springdemo.entities.User;
import com.marcprojects.springdemo.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Integer id) {
		return repository.findById(id).get();
	}
	
	public User insert(User user){
		return repository.save(user);
	}
}
