package com.mariosergiopires.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariosergiopires.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
