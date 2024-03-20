package com.marcprojects.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcprojects.springdemo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{}