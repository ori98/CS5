package com.cs5.persistence;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {
        
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/CS5", "root", "Orijit98");
    	
    	
        return connection;
    }

}