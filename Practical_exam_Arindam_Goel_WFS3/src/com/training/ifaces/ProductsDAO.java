package com.training.ifaces;

/*
 * Author: Arindam Goel
 * Purpose: Interface for structuring the addItems and getReport methods
 * */

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.training.entity.*;

public interface ProductsDAO {

	public boolean addNewItems(List<FoodItems> foodList, FoodItems item);
	public boolean addNewItems(List<Apparel> apparelList, Apparel item);
	public boolean addNewItems(List<Electronics> electronicsList, Electronics item);
	
	public <T> List<T> viewReport(String productType);
	
}
