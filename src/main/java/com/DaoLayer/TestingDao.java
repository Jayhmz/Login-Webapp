package com.DaoLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestingDao {

	public static void main(String[] args) {

		final String url = "jdbc:mysql://localhost:3306/employee?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		final String user = "root";
		final String pass = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("connection successful");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
