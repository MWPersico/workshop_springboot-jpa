package com.marcprojects.springdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.marcprojects.springdemo.entities.User;
import com.marcprojects.springdemo.repositories.UserRepository;
import com.marcprojects.springdemo.services.exceptions.DatabaseException;
import com.marcprojects.springdemo.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Integer id) {
		return repository.findById(id).orElseThrow(()->new ResourceNotFoundException(id));
	}
	
	public User insert(User user){
		return repository.save(user);
	}
	
	public void delete(Integer id) {
		repository.findById(id).orElseThrow(()->new ResourceNotFoundException(id));
		try {
			repository.deleteById(id);						
		}catch(DataIntegrityViolationException ex) {
			throw new DatabaseException(ex.getMessage());
		}
	}
	
	public User update(User data, Integer id) {
		try {
			User user = repository.getReferenceById(id);
			updateData(user, data);
			return repository.save(user);
		}catch(EntityNotFoundException ex) {
			throw new ResourceNotFoundException(id);
		}
	}
	
	private static void updateData(User entity, User data) {
		entity.setName(data.getName());
		entity.setEmail(data.getEmail());
		entity.setPassword(data.getPassword());
		entity.setPhone(data.getPhone());
	}
	
}
