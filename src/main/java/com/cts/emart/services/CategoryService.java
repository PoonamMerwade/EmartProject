package com.cts.emart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.beans.Category;
import com.cts.emart.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository rep;
	
	/* Retrieving all categories */
	public List<Category> getAll() {
		
		return (List<Category>) rep.findAll();
	}

	public void addCategory(Category category) {
		rep.save(category);
	}
	
	
}
