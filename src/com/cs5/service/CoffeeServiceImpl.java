package com.cs5.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import com.cs5.bean.Coffee;
import com.cs5.persistence.CoffeeDAO;
import com.cs5.persistence.CoffeeDAOImpl;

public class CoffeeServiceImpl implements CoffeeService{

	CoffeeDAO cofDAO = new CoffeeDAOImpl();
	
	@Override
	public Collection<Coffee> getMenu() throws ClassNotFoundException, SQLException, IOException {
		
		return cofDAO.getCoffeeMenu();
	}
	
}
