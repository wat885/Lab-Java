package com.buzzfreeze.lab;

public class Course implements IProductFrontPage {

	public String price;
	public String title;
	public String urlImage;
	public String instructor;
	public int numTotal;
	public int numSold;

	public Course(String price, String title, String urlImage, String instructor, int numTotal, int numSold) {
		super();
		this.price = price;
		this.title = title;
		this.urlImage = urlImage;
		this.instructor = instructor;
		this.numTotal = numTotal;
		this.numSold = numSold;
	}

	@Override
	public String getTile() {
		// TODO Auto-generated method stub
		return this.title;
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getUrlImage() {
		// TODO Auto-generated method stub
		return this.urlImage;
	}

	@Override
	public String getSoldText() {
		// TODO Auto-generated method stub
		return "Sold " + this.numSold + " From " + this.numTotal;
	}

}
