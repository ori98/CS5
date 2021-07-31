package com.cs5.persistence;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.sql.*;

import com.cs5.bean.Customer;

public class CustomerDAOImpl implements CustomerDAO{

	@Override
	public boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Connection connection = MySQLConnection.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO customer(phone, cust_fname, cust_lname) VALUES(?,?,?)");
		
		preparedStatement.setString(1, customer.getPhone());
		preparedStatement.setString(2, customer.getF_name());
		preparedStatement.setString(3, customer.getL_name());
		
		
		int affectedRows = preparedStatement.executeUpdate();
		
		return affectedRows > 0;
	}

	@Override
	public Collection<Customer> getCustomer(String phone) throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Connection connection = MySQLConnection.getConnection();
		
		Collection<Customer> cust = new ArrayList<Customer>();
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM CUSTOMER WHERE phone = ?");
		
		preparedStatement.setString(1, phone);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		generateCust(resultSet, cust);
		
		return cust;
	}
	
	public void generateCust(ResultSet resultSet, Collection<Customer> cust) throws SQLException {
		
		String phone = "not", fname = "not", lname = "not";
		
		if(resultSet.next()) {
			phone = resultSet.getString("phone");
			fname = resultSet.getString("cust_fname");
			lname = resultSet.getString("cust_lname");
		}
		
		cust.add(new Customer(phone, fname, lname));
	}

	@Override
	public boolean isPresent(String phone) throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Connection connection = MySQLConnection.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) AS count FROM customer WHERE phone = ?");
		
		preparedStatement.setString(1, phone);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		int found = 0;
		
		if(resultSet.next()) {
			found = resultSet.getInt("count");
		}
		return found > 0;
	}

}
