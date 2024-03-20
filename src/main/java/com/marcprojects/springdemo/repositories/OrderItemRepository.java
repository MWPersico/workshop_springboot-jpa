package com.marcprojects.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcprojects.springdemo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{}
