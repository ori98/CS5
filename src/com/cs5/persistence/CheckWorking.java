package com.cs5.persistence;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckWorking {
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {

		Connection connection = MySQLConnection.getConnection();

		PreparedStatement preparedStatement = connection
				.prepareStatement("SELECT COUNT(*) AS count FROM customer WHERE phone = ?");

		String s = "213";
		preparedStatement.setString(1, s);

		ResultSet rs = preparedStatement.executeQuery();

		if (rs.next()) {
	        int numberOfRows = rs.getInt("count");
	        System.out.println("numberOfRows= " + numberOfRows);
	      }
	}
}
