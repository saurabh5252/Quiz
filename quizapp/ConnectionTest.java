package com.sjprogramming.quizapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	
	Connection connection = null;
	public Connection getConnectionDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","Saurabh@2411");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;

}
	
}

