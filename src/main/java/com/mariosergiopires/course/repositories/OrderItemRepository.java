package com.mariosergiopires.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariosergiopires.course.entities.OrderItem;
import com.mariosergiopires.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
