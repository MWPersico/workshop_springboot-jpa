package com.marcprojects.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcprojects.springdemo.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{}
