package com.buzzfreeze.collectionlab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import com.buzzfreeze.java15.Product;

public class Main {
	public static void main(String [] args) {
		
//		16.3 Collection3
		
		Product p1 = new Product("10000", "iPhone", "", "");
		Product p2 = new Product("10000", "Androd", "", "");
		Product p3 = new Product("10000", "Samsung", "", "");
		Product p4 = new Product("10000", "test", "", "");
		Product p5 = new Product("10000", "Samsung", "", "");

		String customer1 = "Oak";
		
		HashMap<String, Product> likeness = new HashMap<>();
		likeness.put(customer1, p1);
		likeness.put("Touch", p2);
		likeness.put("Via", p3);
		
		System.out.println(likeness);
		
		Product productOakLie = likeness.get("Oak");
		System.out.println(productOakLie);
		
		HashMap<Product, Product> releateProduct = new HashMap<>();
		releateProduct.put(p1, p2);
		releateProduct.put(p3, p4);
		releateProduct.put(p4, p5);
		System.out.println(releateProduct);
		Product x = releateProduct.get(p3);
		
		System.out.println(x);
		releateProduct.remove(p3);
		System.out.println(releateProduct);
		
		
		
		

		
//		16.3 Collection3
		
////		16.2 Collection2
//		
//		Product p1 = new Product("10000", "iPhone", "", "");
//		Product p2 = new Product("10000", "Androd", "", "");
//		Product p3 = new Product("10000", "Samsung", "", "");
//		Product p4 = new Product("10000", "test", "", "");
//		Product p5 = new Product("10000", "Samsung", "", "");
//		HashSet<Product> products= new HashSet<Product>();
//		products.add(p1);
//		products.add(p2);
//		products.add(p3);
//		products.add(p4);
//		products.add(p5);
//		System.out.println(products);
//		
////		HashSet<String> sets= new HashSet<String>();
////		sets.add("A");
////		sets.add("A");
////		sets.add("A");
////		System.out.println(sets);
//		
////		16.2 Collection2
		
		
//		16.1 Collection1

//		// array  
////		String[] studnets = new String[10];
////		
////		String[] carts = new String[4];
////		carts[0] = "iPhone";
////		carts[1] = "Notebook";
////		for (int i = 0; i < carts.length; i++) {
////			
////			if(carts[i] != null){
////				System.out.println(carts[i]);
////			}
////		}
//		
//		String oak = "Oak";
//		String via = "via";
//		String touch = "Touch";
//		ArrayList<String> students = new ArrayList<String>();
////		students.add(touch);
//		students.add(via);
//		students.add(oak);
//		System.out.println(students);
//		for (Iterator iterator = students.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
////			System.out.println(string);
//			
//		}
//		for (String string : students) {
////			System.out.println(string);
//		}
//		students.remove(oak);
//		System.out.println(students);
//		//;
//		
//		Product p1 = new Product("10000", "iPhone", "", "");
//		Product p2 = new Product("10000", "Androd", "", "");
//		Product p3 = new Product("10000", "Samsung", "", "");
//		Product p4 = new Product("10000", "test", "", "");
//		
//		ArrayList<Product> products = new ArrayList<Product>();
//		products.add(p1);
//		products.add(p2);
//		products.add(p3);
//		products.add(p4);
////		System.out.println(products);
////		
////		products.remove(p1);
////		System.out.println(products);
////		products.clear();
////		System.out.println(products);
//		System.out.println(products);
//		Product removeProduct = null;
//		for (Product product : products) {
//			if(product.title.equals("iPhone")) {
//				removeProduct = product;
//			}
//		}
//		if(removeProduct != null) {
//			products.remove(removeProduct);
//		}
//		System.out.println(products);
		
		
//		16.1 Collection1



		
	}
}
