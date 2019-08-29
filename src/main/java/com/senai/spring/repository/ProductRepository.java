package com.senai.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.spring.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}