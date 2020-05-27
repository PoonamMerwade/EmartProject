package com.cts.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.beans.CheckOut;
import com.cts.emart.services.CheckoutService;

@RestController
public class CheckoutController {

	@Autowired
	CheckoutService service;
	
	@RequestMapping("/check")
	public List<CheckOut> getAll() {
		
		return service.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/check")
	public void addCheck(@RequestBody CheckOut check) {
		
		service.addCheck(check);
	}

	@RequestMapping("/check/{checkoutId}")
	public Optional<CheckOut> getAllById(@PathVariable int checkoutId) {
		
		return service.getDetailsById(checkoutId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/check/")
	public void updateProducts(@RequestBody CheckOut check) {
		
		service.updateProduct(check);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/check/{checkoutId}/")
	public void deleteProducts(@PathVariable int checkoutId) {
		
		service.deleteProduct(checkoutId);
	}
}
