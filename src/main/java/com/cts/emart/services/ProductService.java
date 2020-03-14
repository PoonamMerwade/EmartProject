package com.cts.emart.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.beans.Products;
import com.cts.emart.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository rep;
	
	public List<Products> getAll() {
		
		return (List<Products>) rep.findAll();
	}
	
	public void addProducts(Products product) {
		
		rep.save(product);
	}
	
	public Optional<Products> getDetailsById(int productId) {
		
		return rep.findById(productId);
	}
	
	public void updateProduct(Products product) {
		
		rep.save(product);
	}
	
	public void deleteProduct(int productId) {
		
		rep.deleteById(productId);
	}
}
