package com.marcprojects.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marcprojects.springdemo.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{}
