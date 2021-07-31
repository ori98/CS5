package com.cs5.helper;

import com.cs5.bean.*;

import java.util.Collection;
import java.util.Scanner;

public class CustomerInputOutput {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void displayCustomer(Collection<Customer> collection) {
		for(Customer customer : collection) {
			System.out.println("Greetings " + customer.getF_name() + " " + customer.getL_name() +". What would you like to try today");
		}
	}
	
	public static void displayCoffeeMenu(Collection<Coffee> collection) {
		for(Coffee coffee : collection) {
			System.out.println();
			
			System.out.println("Coffee name:");
			System.out.println(coffee.getName());
			System.out.println("Prices:");
			
			System.out.print("Regular: " + coffee.getPrices().get(0) + " ; ");
			System.out.print("Medium: " + coffee.getPrices().get(1) + " ; ");
			System.out.print("Large: " + coffee.getPrices().get(2));
			
			System.out.println();
			System.out.println();
			System.out.println("==============================================================");
		}
	}
	
	public static Customer createCustomer(String phone) {
		String fname;
		String lname;
		
		while(true) {
			System.out.println("Enter your first name: ");
			fname = sc.nextLine();
			
			if(fname.length() > 0) break;
			
			else {
				System.out.println("Invalid Name: ");
			}
			
		}
		
		while(true) {
			System.out.println("Enter your last name: ");
			lname = sc.nextLine();
			
			if(lname.length() > 0) break;
			
			else {
				System.out.println("Invalid Name: ");
			}
			
		}
		
		return new Customer(phone, fname, lname);
	}
}
