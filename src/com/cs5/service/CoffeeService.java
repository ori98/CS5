package com.cs5.service;

import java.io.IOException;
import java.sql.SQLException;
import com.cs5.bean.*;
import java.util.Collection;

public interface CoffeeService {
	Collection<Coffee> getMenu() throws ClassNotFoundException, SQLException, IOException;
}
