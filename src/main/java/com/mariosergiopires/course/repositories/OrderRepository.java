package com.mariosergiopires.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariosergiopires.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
