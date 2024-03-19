package com.marcprojects.springdemo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcprojects.springdemo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping(value = {"/", ""})
	public ResponseEntity<User> findAll() {
		return ResponseEntity.ok(new User(1, "Marcos", "willian.marcos7@hotmail.com", "1234", "4321"));
	}
}
