package com.cts.emart.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;
	private String categoryName;
//	
//	@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
//	private Set<ElectronicProducts> products; 
	
	public Category() {
		
	}

	

	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
//		this.products = products;
	}



	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}



//	public Set<ElectronicProducts> getProducts() {
//		return products;
//	}
//
//
//
//	public void setProducts(Set<ElectronicProducts> products) {
//		this.products = products;
//	}
	
	

}
