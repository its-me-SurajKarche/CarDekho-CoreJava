package com.jspiders.cardekho_case_study.main;

import java.util.Scanner;

import com.jspiders.cardekho_case_study.entity.Car;
import com.jspiders.cardekho_case_study.operation.CarOperation;
public class CardekhoMenu {
	public static Scanner inp= new Scanner(System.in);
	private static boolean flag=true;
	public static CarOperation operation=new CarOperation();
	static boolean flag2=true;
	
	public static void main(String[] args) {
		
		while(flag) {
		mainMenu();
		}
	}
	public static void carSearch() {
		
		if(CarOperation.carCollection.isEmpty()) {
			System.out.println("no data to fetch");
			flag2=false;
		}
		else {
		System.out.println("Search car by"
				+ " \n 1.name"
				+ "\n 2.brand"
				+ "\n 3.fuel type"
				+ "\n 4.ID"
				+ "\n 5.price"
				+ "\n 6.go back");
		
		int inpSearch=inp.nextInt();

		switch (inpSearch) {
		
		case 1: {
			
			System.out.println("searching car by name");
			operation.searchCarByName();
			break;
		}
		case 2: {
			
			System.out.println("searching car by brand");
			operation.searchCarByBrand();
			break;
		}
		case 3: {
			
			System.out.println("searching car by fuel type");
			operation.searchCarByFuel();
			break;
		}
		case 4: {
			System.out.println("searching by id");
			operation.searchCarByID();
			break;
		}
		case 5: System.out.println("searching by price"); 
		operation.searchCarByPrice();
		break;
		
		case 6: {
			System.out.println("going back");
			flag2=false;
			break;
		}
		default:
			System.out.println("invalid input");
			carSearch();
			break;
		}
	}}
	public static void mainMenu() {
		
		System.out.println("======Main Menu======\n"
				+ " 1.Add Car Details\n"
				+ " 2.Search Car Details\n "
				+ "3.Update Car Details\n "
				+ "4.Delete Car Details\n "
				+ "5.AllCarDetails \n"
				+ " 6.Exit");
		
		int inpMain=inp.nextInt();
		switch (inpMain) {
		case 1: {
			System.out.println("adding cars ");
			operation.addCar();
			break;
			
		}
		case 2: {
			flag2=true;
			while(flag2) {
			carSearch();}
			break;
		}
		case 3: {
			System.out.println("updating car details");
			operation.updateCar();
			break;
		}
		case 4: {
			System.out.println("deleteing car ");
			 operation.deleteCar();
			break;
		}
		case 6: {
			flag=false;
			CarOperation.flag=false;
			Car.flag=false;
			System.out.println("thank you!!!");
			break;
		}
		case 5: operation.carDetails();break;
		
		default:
			System.out.println("invalid input");
			break;
		}
		
	}
}
