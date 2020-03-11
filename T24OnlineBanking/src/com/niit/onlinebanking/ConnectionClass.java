package com.niit.onlinebanking;

import java.sql.*;

public class ConnectionClass {

	public static Connection getConnection() {
		Connection con = null;
		try {
			// load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create the connection object
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/online_banking", "root",	"root");
		} catch (Exception e) {
			System.out.println("Error in connection" + e);
		}

		return con;
	}
}
