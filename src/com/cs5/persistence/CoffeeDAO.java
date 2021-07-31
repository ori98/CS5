package com.cs5.persistence;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

import com.cs5.bean.Coffee;

public interface CoffeeDAO {
	Collection<Coffee> getCoffeeMenu() throws SQLException, IOException, ClassNotFoundException;
}
