package com.cts.emart.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.emart.beans.CheckOut;
import com.cts.emart.repository.CheckoutRepository;

@Service
public class CheckoutService {
	
//	public List<Customers> getAll(){
//		return Arrays.asList(
//				new Customers(1,"poo","mer","poo@gmail.com","6478903746","49-d3","kolii","banglore",518220),
//				new Customers(2,"kusu","kumari","kumari@gmail.com","7542136980","47-d3","krishna nagar","kurnool",518002),
//				new Customers(3,"dev","devv","dev@gmail.com","1236547890","49-e2","kailash","swargh",998862));
//	}
	
	@Autowired
	CheckoutRepository repo;
	
	public List<CheckOut> getAll(){
		return (List<CheckOut>) repo.findAll();
	}
	
	public void addCheck(CheckOut check){
		
		 repo.save(check);
		
	}
	
	public Optional<CheckOut> getDetailsById(int checkoutId) {
		
		return repo.findById(checkoutId);
	}
	
	
	public void updateCheckout(CheckOut check) {
		
		repo.save(check);
	}
	
	public void deleteCheckout(int checkoutId) {
		
		repo.deleteById(checkoutId);
	}

}
