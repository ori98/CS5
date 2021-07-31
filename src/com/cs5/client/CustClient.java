package com.cs5.client;

import java.util.Scanner;

import com.cs5.Presentation1.CustPresentation;
import com.cs5.Presentation1.CustPresentationImp;

public class CustClient {
	public static void main(String args[]) {
		CustPresentation custPresentation = new CustPresentationImp();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			custPresentation.showMenu();
			
			String phone = sc.next();
			
			custPresentation.performMenu(phone);
			
			break;
		}
		
		custPresentation.showCoffeeMenu();
	}
}
