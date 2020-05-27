package com.cts.emart.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seller {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sellerId;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String companyDetails;
	private String emailId;
	private String mobileNumber;
	
	
	public Seller() {
		
	}


	public Seller(int sellerId, String firstName, String lastName, String userName, String password,
			String companyDetails, String emailId, String mobileNumber) {
		super();
		this.sellerId = sellerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.companyDetails = companyDetails;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}


	public int getSellerId() {
		return sellerId;
	}


	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCompanyDetails() {
		return companyDetails;
	}


	public void setCompanyDetails(String companyDetails) {
		this.companyDetails = companyDetails;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	

}
