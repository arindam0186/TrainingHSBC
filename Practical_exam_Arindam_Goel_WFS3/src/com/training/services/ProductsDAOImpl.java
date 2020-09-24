package com.training.services;

/*
 * Author: Arindam Goel
 * Purpose: Implements the DAO, works as a service class
 * */

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.training.entity.Apparel;
import com.training.entity.Electronics;
import com.training.entity.FoodItems;
import com.training.ifaces.ProductsDAO;

public class ProductsDAOImpl implements ProductsDAO {

	@Override
	public boolean addNewItems(List<FoodItems> foodList, FoodItems item) {

		List<FoodItems> itemSet = (List<FoodItems>) foodList;
		try {
			itemSet.add(item);
			return true;
		} 
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean addNewItems(List<Apparel> apparelList, Apparel item) {

		List<Apparel> itemSet = (List<Apparel>) apparelList;
		try {
			itemSet.add(item);
			return true;
		} 
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean addNewItems(List<Electronics> electronicsList, Electronics item) {

		List<Electronics> itemSet = (List<Electronics>) electronicsList;
		try {
			itemSet.add(item);
			return true;
		} 
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public List<T> viewReport(String productCategory) {

		List<T> itemSet = map.get(productCategory);
		itemSet.sort(QuantityComparator);
		
		return itemSet;
	}

}
