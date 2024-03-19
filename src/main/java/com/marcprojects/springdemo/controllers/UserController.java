package com.marcprojects.springdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcprojects.springdemo.entities.User;
import com.marcprojects.springdemo.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value = {"/", ""})
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Integer id){
		return userRepository.findById(id).get();
	}
}
