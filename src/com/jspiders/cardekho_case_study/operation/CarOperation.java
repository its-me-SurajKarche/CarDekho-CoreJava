package com.jspiders.cardekho_case_study.operation; 
import com.jspiders.cardekho_case_study.entity.*;
import com.jspiders.cardekho_case_study.main.CardekhoMenu;
import java.util.ArrayList;
import java.util.Scanner;

public class CarOperation {
	public static CardekhoMenu menu= new CardekhoMenu();
	
	public static ArrayList<Car> carCollection = new ArrayList<Car>();
	
    public static Scanner inp1=new Scanner(System.in);
    public static boolean flag=true;
	public static void main(String[] args) {
		while(flag) {
		CardekhoMenu.mainMenu();}
      }
//    public void addCar() {
//    	System.out.println("how many cars you want to add");
//		int carAmount=inp1.nextInt();
//		for(int i=0; i<carAmount; i++) {
//			Car car=new Car();
//		System.out.println("enter car id for "+(i+1)+" car");
//			int id=inp1.nextInt();
//			inp1.nextLine();
//			System.out.println("enter car name for "+(i+1)+" car");
//			String name=inp1.nextLine();
//			System.out.println("enter car brand for "+(i+1)+" car");
//			String brand=inp1.nextLine();
//			System.out.println("enter car fuel tyep for "+(i+1)+" car");
//			String fuel=inp1.nextLine();
//			System.out.println("enter car price for "+(i+1)+" car");
//			double price=inp1.nextDouble();
//			car.intializer(name,price,brand,fuel,id);
//			carCollection.add(car);
//			System.out.println("car successfully added ");
//		}
//		carDetails();
//    	
//    }
	public void addCar() {
		System.out.println("how many cars you want to add");
		int carAmount=inp1.nextInt();
		for(int i=0; i<carAmount; i++) {
			Car car = new Car();
			System.out.println("enter car id for "+(i+1)+" car");
			car.setCarID(inp1.nextInt());
			inp1.nextLine();
			System.out.println("enter car name for "+(i+1)+" car");
			car.setCarName(inp1.nextLine());
			System.out.println("enter car brand for "+(i+1)+" car");
			car.setBrandName(inp1.nextLine());
			System.out.println("enter car fuel tyep for "+(i+1)+" car");
			car.setFuelType(inp1.nextLine());
			System.out.println("enter car price for "+(i+1)+" car");
			car.setPrice(inp1.nextDouble());
			carCollection.add(car);
			System.out.println("car successfully added ");
		}
		carDetails();
		
	}
	public void searchCarByID() { 
		int count=0;
		if(carCollection.isEmpty()) {
			System.out.println("no data to fetch");
		}
		else {
		System.out.println("enter id of car");
		int inp=inp1.nextInt();
		for (int i = 0; i < carCollection.size(); i++) {
			if(inp==(carCollection.get(i).getCarID())) {
				count++;
				System.out.println(carCollection.get(i));
			
			}
		  }
		if(count==0) {
			System.out.println("no car with such ID found");
		}
		}	
	}
	
	
	public void searchCarByName() { 
		int count=0;
		if(carCollection.isEmpty()) {
			System.out.println("no data to fetch");
		}
		else {
			
		System.out.println("enter name of car");
		String inp=inp1.nextLine();
		
		for (int i = 0; i < carCollection.size(); i++) {
			if(inp.equalsIgnoreCase(carCollection.get(i).getCarName())) {
				count++;
				System.out.println(carCollection.get(i)); 
				
			}
		  }
		if(count==0) {
			System.out.println("no car with such Name found");
		}
		}	
	}
	
	public void searchCarByPrice() { 
		int count =0;
		if(carCollection.isEmpty()) {
			System.out.println("no data to fetch");
		}
		else {
		System.out.println("enter price of car");
		double inp=inp1.nextDouble();
		for (int i = 0; i < carCollection.size(); i++) {
		
			if(inp == carCollection.get(i).getPrice()) {
				count++;
				System.out.println(carCollection.get(i)); 
			}
		  }
		if(count==0) {
			System.out.println("no car with such Price found");
		}
		}	
	}
	
	public void searchCarByFuel() {
		int count=0;
		if(carCollection.isEmpty()) {
			System.out.println("no data to fetch");
		}
		else {
			
		System.out.println("enter fuel type of car");
		String inp=inp1.nextLine();
		for (int i = 0; i < carCollection.size(); i++) {
			if(inp.equalsIgnoreCase(carCollection.get(i).getFuelType())) {
				count++;
				System.out.println(carCollection.get(i)); 
		
			}
		  }
		if(count==0) {
			System.out.println("no car with such Fuel type found");
		}
		}	
	}
	
	public void searchCarByBrand() {
		int count=0;
		if(carCollection.isEmpty()) {
			System.out.println("no data to fetch");
		}
		else {
			
		System.out.println("enter brand of car");
		String inp=inp1.nextLine();
		for (int i = 0; i < carCollection.size(); i++) {
			if(inp.equalsIgnoreCase(carCollection.get(i).getBrandName())) {
				count++;
				System.out.println(carCollection.get(i));
			}
		  }
		if(count==0) {
			System.out.println("no car with such brand found");
		}
		}	
	}
	
	public void updateCar() {
		if(carCollection.isEmpty()) {
			System.out.println("no cars to update");
		}
		else {
			int count=0;
			System.out.println("enter car id you want to update");
			int id=inp1.nextInt();
			inp1.nextLine();
			for (int i = 0; i < carCollection.size(); i++) {
				if(id==carCollection.get(i).getCarID()) {
					count++;
					Car car=carCollection.get(i);
					System.out.println("enter new car name for "+" car");
					car.setCarName(inp1.nextLine());
					System.out.println("enter new car brand for "+" car");
					car.setBrandName(inp1.nextLine());
					System.out.println("enter new car fuel tyep for "+" car");
					car.setFuelType(inp1.nextLine());
					System.out.println("enter new car price for "+" car");
					car.setPrice(inp1.nextInt());
					System.out.println("car successfully updated ");		
				}	
			}
			if(count==0) {
				System.out.println("no car with that id found");
			}
			carDetails();
		}
	}
	
	public void deleteCar() {
		int count=0;
		if(carCollection.isEmpty()) {
			System.out.println("Their are no cars in database to delete ");
		}
		else {
			System.out.println("enter the id of car to delete");
			int inp=inp1.nextInt();
			ArrayList<Car> removed= new ArrayList<Car>();
			for (int i = 0; i < carCollection.size(); i++) {
				if(inp==carCollection.get(i).getCarID()) {
					count++;
					removed.add(carCollection.get(i));
					carCollection.removeAll(removed);
					System.out.println("car succenfully removed");
					i--;
				}
			}
			if(count==0) {
				System.out.println("no car with that id found");
			}
			
		}
	}
	public void carDetails() {
		System.out.println("car_ID\t        car_Name\tcar_brand\tfuel_type\t1car_price");
		for (Car car : carCollection) {
			System.out.println(car.getCarID()+"\t\t"+car.getCarName()+"\t\t"+car.getBrandName()+"\t\t"+car.getFuelType()+"\t\t"+car.getPrice());
		}
	}
}
