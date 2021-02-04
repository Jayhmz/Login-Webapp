package com.DaoLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Userdetail;

public class UserDao {

//	final String url = "jdbc:mysql://localhost:3306/userlogin?useSSL=false";
	final String url = "jdbc:mysql://localhost:3306/loginapp?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	final String user = "root";
	final String pass = "";

	Connection conn;
	PreparedStatement stmt;

	public int Register(Userdetail userdetail) throws ClassNotFoundException {

		int result = 0;

		String registerUser = "INSERT INTO userlogin"
				+ "(id, firstname, lastname, email, phone, username, password ) values" + "(?,?,?,?,?,?,?);";
		
		Class.forName("com.mysql.jdbc.Driver");

		try {
			conn = DriverManager.getConnection(url, user, pass);
			stmt = conn.prepareStatement(registerUser);
			System.out.println("connection to database successful...");

			stmt.setInt(1, 1);
			stmt.setString(2, userdetail.getFname());
			stmt.setString(3, userdetail.getLname());
			stmt.setString(4, userdetail.getEmail());
			stmt.setString(5, userdetail.getPhone());
			stmt.setString(6, userdetail.getUname());
			stmt.setString(7, userdetail.getPassword());
 
			// 3. execute the update

			result = stmt.executeUpdate();
			System.out.println("got here...");
//

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return result;

	}

}
