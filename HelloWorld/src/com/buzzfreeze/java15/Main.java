package com.buzzfreeze.java15;

public class Main {
	
	public static void main (String[] args) {

		
		Product x = new Product(null, null, null, null);
		x.producStatus = ProductStatus.Status.DRAFT;
		x.priceStatus = ProductStatus.PriceStatus.DEAL;
	}

}
