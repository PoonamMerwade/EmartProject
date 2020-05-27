package com.cts.emart.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.emart.beans.Seller;

public interface SellerRepository extends CrudRepository<Seller, Integer>{
	
	//if you want to search by our own properties then write methods here....
	
	//default search method is searchById

}
