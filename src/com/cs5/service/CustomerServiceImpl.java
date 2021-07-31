package com.cs5.service;

import java.util.Collection;

import com.cs5.bean.Customer;
import com.cs5.persistence.*;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class CustomerServiceImpl implements CustomerService{

	CustomerDAO cusDao = new CustomerDAOImpl();
	
	@Override
	public boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		return cusDao.addCustomer(customer);
	}

	@Override
	public Collection<Customer> getCustomer(String phone) throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		return cusDao.getCustomer(phone);
	}

	@Override
	public boolean isPresent(String phone) throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		return cusDao.isPresent(phone);
	}

}
