package com.cs5.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import com.cs5.bean.Customer;

public interface CustomerService {
	boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException, IOException;
	Collection<Customer> getCustomer(String phone) throws SQLException, ClassNotFoundException, IOException;
	boolean isPresent(String phone) throws SQLException, ClassNotFoundException, IOException;
}
