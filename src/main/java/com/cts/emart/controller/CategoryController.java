package com.cts.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.beans.Category;
import com.cts.emart.beans.CheckOut;
import com.cts.emart.beans.Products;
import com.cts.emart.services.CategoryService;
import com.cts.emart.services.CheckoutService;
import com.cts.emart.services.ProductService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	@Autowired
	ProductService service1;
	
	@Autowired
	CheckoutService service2;
	

	@RequestMapping("/categories")
	public List<Category> getAll() {
		return service.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/categories")
	public void addCategory(@RequestBody Category category) {
		
		service.addCategory(category);
	}
	
	
	/* ProductService  */
	
	@RequestMapping("/products")
	public List<Products> getAllProducts() {
		
		return service1.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/categories/{categoryId}")
	public void addProducts(@RequestBody Products product) {
		
		service1.addProducts(product);
	}

	@RequestMapping("/products/{productId}")
	public Optional<Products> getAllById(@PathVariable int productId) {
		
		return service1.getDetailsById(productId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/products/")
	public void updateProducts(@RequestBody Products product) {
		
		service1.updateProduct(product);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/products/{productId}/")
	public void deleteProducts(@PathVariable int productId) {
		
		service1.deleteProduct(productId);
	}
	
	/* CheckOutService */
	
	@RequestMapping("/check")
	public List<CheckOut> getAllCheckOuts() {
		
		return service2.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/check")
	public void addCheck(@RequestBody CheckOut check) {
		
		service2.addCheck(check);
	}

	@RequestMapping("/check/{checkoutId}")
	public Optional<CheckOut> getAllCheckOutById(@PathVariable int checkoutId) {
		
		return service2.getDetailsById(checkoutId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/check/")
	public void updateCheckOuts(@RequestBody CheckOut check) {
		
		service2.updateCheckout(check);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/check/{checkoutId}/")
	public void deleteCheckout(@PathVariable int checkoutId) {
		
		service2.deleteCheckout(checkoutId);
	}
}



///categories/{categoryId}
