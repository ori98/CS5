package com.cs5.bean;

public class Customer {
	
	private String phone;
	private String f_name;
	private String l_name;
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public Customer(String phone, String f_name, String l_name) {
		super();
		this.phone = phone;
		this.f_name = f_name;
		this.l_name = l_name;
	}
	
	
	
}
