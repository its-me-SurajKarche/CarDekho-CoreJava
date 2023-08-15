package com.jspiders.cardekho_case_study.entity;

import com.jspiders.cardekho_case_study.main.CardekhoMenu;

public class Car {
	private  String carName;
	private  double price;
	private  String brandName;
	private  String fuelType;
	private  int carID ;
    public   static boolean flag =true;
	static CardekhoMenu menu =new CardekhoMenu();
	public static void main(String[] args) {
		while(flag) {
			CardekhoMenu.mainMenu();
		}
		
      }
	public void intializer(String carName,double price,String brandName,String FuelType,int carID) {
		this.carName=carName;
		this.price=price;
		this.brandName=brandName;
		this.fuelType=FuelType;
		this.carID=carID;
		
	}

	public  String getCarName() {
		return carName;
	}

	public  void setCarName(String carName) {
		this.carName = carName;
	}

	public  double getPrice() {
		return price;
	}

	public  void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [CarName = " + carName + ", Price = " + price + ", BrandName = " + brandName
				+ ", FuelTyp = " +fuelType + ", CarID = " + carID + "]";
	}

	public  String getBrandName() {
		return brandName;
	}

	public  void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public  String getFuelType() {
		return fuelType;
	}

	public  void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public  int getCarID() {
		return carID;
	}

	public  void setCarID(int carID) {
		this.carID = carID;
	}
}