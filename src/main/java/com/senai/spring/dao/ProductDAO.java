package com.senai.spring.dao;

import java.util.List;
import com.senai.spring.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.senai.spring.repository.ProductRepository;

@Service
@Transactional
public class ProductDAO {
	@Autowired
	private ProductRepository repo;
	
	public List<Product> listaAll() {
		return repo.findAll();
	}
	public Product getId (int id) {
		return repo.findById(id).get();
	}
	public void delete (int id) {
		repo.deleteById(id);
	}
	public void save (Product product) {
		repo.save(product);
	}
}