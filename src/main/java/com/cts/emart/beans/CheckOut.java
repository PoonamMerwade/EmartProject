package com.cts.emart.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CheckOut {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int checkoutId;
	private String fullName;
	private String emailId;
	private String address;
	private String city;
	private String state;
	private long zip;
	private String nameOnCard;
	private String cardNumber;
	private String expMonth;
	private String expYear;
	private int cvv;

	
	public CheckOut() {
		
	}

	public CheckOut(int checkoutId, String fullName, String emailId, String address, String city, String state,
			long zip, String nameOnCard, String cardNumber, String expMonth, String expYear,int cvv
			) {
		super();
		this.checkoutId = checkoutId;
		this.fullName = fullName;
		this.emailId = emailId;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.nameOnCard = nameOnCard;
		this.cardNumber = cardNumber;
//		this.paymentMonth = paymentMonth;
		this.expMonth = expMonth;
		this.expYear = expYear;
		this.cvv=cvv;
//		this.telephone = telephone;
	}

	public int getCheckoutId() {
		return checkoutId;
	}

	public void setCheckoutId(int checkoutId) {
		this.checkoutId = checkoutId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String creditCardNumber) {
		this.cardNumber = cardNumber;
	}

//	public String getPaymentMonth() {
//		return paymentMonth;
//	}
//
//	public void setPaymentMonth(String paymentMonth) {
//		this.paymentMonth = paymentMonth;
//	}

	public String getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}

	public String getExpYear() {
		return expYear;
	}

	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}

//	public String getTelephone() {
//		return telephone;
//	}
//
//	public void setTelephone(String telephone) {
//		this.telephone = telephone;
//	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

		
}
