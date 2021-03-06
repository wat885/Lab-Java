package com.buzzfreeze.lab;

public class Product implements IProductFrontPage {

	public String price;
	public String title;
	public String urlImage;
	public String soldText;
	public String status = "";
	public ProductStatus.Status producStatus;
	public ProductStatus.PriceStatus priceStatus;
	
	public Product (String price, String title, String urlImage, String soldText) {
		this.price = price;
		this.title = title;
		this.urlImage = urlImage;
		this.soldText = soldText;
	}
	
	@Override
	public String getTile() {
		return title;
	}
	@Override
	public String getPrice() {
		return price;
	}
	@Override
	public String getUrlImage() {
		return urlImage;
	}
	@Override
	public String getSoldText() {
		return soldText;
	}

}
