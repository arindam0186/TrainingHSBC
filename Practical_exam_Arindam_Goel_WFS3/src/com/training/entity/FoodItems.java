package com.training.entity;

/*
 * Author: Arindam Goel
 * Purpose: Entity class for FootItems
 * */
public class FoodItems extends Product {

	private String dateOfManufacture;
	private String dateOfExpiry;
	private String isVegetarian;
	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FoodItems(int itemCode, String itemName, int quantity, double unitPrice, String dateOfManufacture, String dateOfExpiry, String isVegetarian) {
		super(itemCode, itemName, quantity, unitPrice);
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.isVegetarian = isVegetarian;
		// TODO Auto-generated constructor stub
	}
	public String getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public String getIsVegetarian() {
		return isVegetarian;
	}
	public void setIsVegetarian(String isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfExpiry == null) ? 0 : dateOfExpiry.hashCode());
		result = prime * result + ((dateOfManufacture == null) ? 0 : dateOfManufacture.hashCode());
		result = prime * result + ((isVegetarian == null) ? 0 : isVegetarian.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItems other = (FoodItems) obj;
		if (dateOfExpiry == null) {
			if (other.dateOfExpiry != null)
				return false;
		} else if (!dateOfExpiry.equals(other.dateOfExpiry))
			return false;
		if (dateOfManufacture == null) {
			if (other.dateOfManufacture != null)
				return false;
		} else if (!dateOfManufacture.equals(other.dateOfManufacture))
			return false;
		if (isVegetarian == null) {
			if (other.isVegetarian != null)
				return false;
		} else if (!isVegetarian.equals(other.isVegetarian))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FoodItems [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry
				+ ", isVegetarian=" + isVegetarian + "]";
	}
	
	
}
