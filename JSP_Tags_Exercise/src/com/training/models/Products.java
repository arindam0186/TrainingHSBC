package com.training.models;

public class Products {

	private String productName;
	private double amount;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(String productName, double amount) {
		super();
		this.productName = productName;
		this.amount = amount;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
