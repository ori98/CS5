package com.cs5.persistence;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.cs5.bean.Coffee;

public class CoffeeDAOImpl implements CoffeeDAO {

	@Override
	public Collection<Coffee> getCoffeeMenu() throws SQLException, IOException, ClassNotFoundException {

		Collection<Coffee> collection = new ArrayList<>();

		Connection connection = MySQLConnection.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM coffee_menu");

		ResultSet resultSet = preparedStatement.executeQuery();

		generateCoffeeMenu(resultSet, collection);

		return collection;
	}

	private void generateCoffeeMenu(ResultSet resultSet, Collection<Coffee> collection) throws SQLException {

		while(resultSet.next()) {
			String name = resultSet.getString(2);
			
			List<Integer> sizes = new ArrayList<Integer>();
			sizes.add(resultSet.getInt(3));
			sizes.add(resultSet.getInt(4));
			sizes.add(resultSet.getInt(5));
			
			collection.add(new Coffee(name, sizes));
		}
	}

}
