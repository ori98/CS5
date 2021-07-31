package com.cs5.Presentation1;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Scanner;

import com.cs5.bean.Coffee;
import com.cs5.bean.Customer;
import com.cs5.helper.CustomerInputOutput;
import com.cs5.service.CoffeeService;
import com.cs5.service.CoffeeServiceImpl;
import com.cs5.service.CustomerService;
import com.cs5.service.CustomerServiceImpl;

public class CustPresentationImp implements CustPresentation {

	public CustomerService customerService;
	public CoffeeService coffeeService;

	{
		customerService = new CustomerServiceImpl();
		coffeeService = new CoffeeServiceImpl();
	}

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Hello Welcome to our Coffee Shop!!! Please Enter your Phone NO: ");

	}

	@Override
	public void performMenu(String phoneNo) {
		// TODO Auto-generated method stub
		try {
			if (customerService.isPresent(phoneNo)) {
				
				CustomerInputOutput.displayCustomer(customerService.getCustomer(phoneNo));
			} else {

				if (customerService.addCustomer(CustomerInputOutput.createCustomer(phoneNo))) {
					System.out.println("You have been registered! What would you like to try?");
				} else {
					System.out.println("Plase retry later");
				}
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void showCoffeeMenu() {
		// TODO Auto-generated method stub
		CoffeeService coffeeService = new CoffeeServiceImpl();
		
		try {
			Collection<Coffee> collection = coffeeService.getMenu();
			CustomerInputOutput.displayCoffeeMenu(collection);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
