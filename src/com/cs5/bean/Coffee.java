package com.cs5.bean;

import java.util.List;

public class Coffee {
	private String name;
	private String size;
	private List addOn;
	private List prices;

	public List getPrices() {
		return prices;
	}

	public void setPrices(List prices) {
		this.prices = prices;
	}

	public List getAddOn() {
		return addOn;
	}

	public void setAddOn(List addOn) {
		this.addOn = addOn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Coffee(String name, String size, List addOn) {
		super();
		this.name = name;
		this.size = size;
		this.addOn = addOn;
	}

	public Coffee(String name, List prices) {
		super();
		this.name = name;
		this.prices = prices;
	}
	
	

}
