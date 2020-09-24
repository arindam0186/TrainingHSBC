package com.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.training.entity.Apparel;
import com.training.entity.Electronics;
import com.training.entity.FoodItems;
import com.training.services.ProductsDAOImpl;

/*
 * Author: Arindam Goel
 * Purpose: Main(View) application
 * */

public class Application {

	public static <T> void main(String[] args) {

		FoodItems milk = new FoodItems(101, "Milk", 10, 40.00, "24/9/2020", "25/9/2020", "Yes");
		FoodItems cake = new FoodItems(111, "Cake", 2, 1200.00, "23/9/2020", "26/9/2020", "No");
		FoodItems pizza = new FoodItems(191, "Pizza", 1, 570.00, "23/9/2020", "26/9/2020", "No");

		Apparel shirt = new Apparel(432, "Shirt", 3, 500.00, "Large", "Cotton");
		Apparel sweater = new Apparel(232, "Sweater", 3, 1500.00, "Large", "Woolen");
		Apparel pant = new Apparel(552, "Pant", 2, 2500.00, "Large", "Cotton");
		
		Electronics tv = new Electronics(12, "TV", 100, 25000.00, 12);
		Electronics mobile = new Electronics(13, "Mobile", 97, 15000.00, 15);
		Electronics watch = new Electronics(14, "Watch", 54, 8000.00, 18);
				
		List<FoodItems> foodList = new ArrayList<FoodItems>();
		List<Apparel> apparelList = new ArrayList<Apparel>();
		List<Electronics> electronicsList = new ArrayList<Electronics>();
		
		HashMap<String, Set<T>> map = new HashMap<String, Set<T>>();
		
		ProductsDAOImpl service = new ProductsDAOImpl();

		
		service.addNewItems(foodList, milk);
		service.addNewItems(foodList, cake);
		service.addNewItems(foodList, pizza);
		
		service.addNewItems(apparelList, shirt);
		service.addNewItems(apparelList, sweater);
		service.addNewItems(apparelList, pant);
		
		service.addNewItems(electronicsList, tv);
		service.addNewItems(electronicsList, mobile);
		service.addNewItems(electronicsList, watch);

				
	}

}
