package com.marcprojects.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcprojects.springdemo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{}