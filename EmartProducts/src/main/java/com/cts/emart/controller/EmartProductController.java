package com.cts.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.beans.Products;
import com.cts.emart.service.ProductService;

@RestController
public class EmartProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/products")
	public List<Products> getAll() {
		
		return service.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/products")
	public void addProducts(@RequestBody Products product) {
		
		service.addProducts(product);
	}

	@RequestMapping("/products/{productId}")
	public Optional<Products> getAllById(@PathVariable int productId) {
		
		return service.getDetailsById(productId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/products/")
	public void updateProducts(@RequestBody Products product) {
		
		service.updateProduct(product);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/products/{productId}/")
	public void deleteProducts(@PathVariable int productId) {
		
		service.deleteProduct(productId);
	}
}
