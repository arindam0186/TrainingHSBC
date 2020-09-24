package com.training.entity;

/*
 * Author: Arindam Goel
 * Purpose: Entity class for Electronic Items
 * */

public class Electronics extends Product {
	
	private int warranty;

	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electronics(int itemCode, String itemName, int quantity, double unitPrice, int warranty) {
		super(itemCode, itemName, quantity, unitPrice);
		this.warranty = warranty;
		// TODO Auto-generated constructor stub
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + warranty;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Electronics other = (Electronics) obj;
		if (warranty != other.warranty)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Electronics [warranty=" + warranty + "]";
	}

	
	
}
