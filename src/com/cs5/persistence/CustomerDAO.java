package com.cs5.persistence;

import java.util.Collection;

import com.cs5.bean.Customer;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public interface CustomerDAO {
	boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException, IOException;
	Collection<Customer> getCustomer(String phone) throws SQLException, ClassNotFoundException, IOException;
	boolean isPresent(String phone) throws SQLException, ClassNotFoundException, IOException;
}