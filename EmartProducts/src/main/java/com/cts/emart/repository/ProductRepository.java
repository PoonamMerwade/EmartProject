package com.cts.emart.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.emart.beans.Products;

public interface ProductRepository extends CrudRepository<Products,Integer>{

}
