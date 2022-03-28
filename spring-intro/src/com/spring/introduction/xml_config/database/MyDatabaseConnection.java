package com.spring.introduction.xml_config.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDatabaseConnection {

	private String driverClassName;
	private String url;
	private String username;
	private String password;

	public MyDatabaseConnection(String driverClassName, String url, String username, String password) {
		this.driverClassName = driverClassName;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public Statement getMyDbConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stmt;
	}

	public ResultSet executeMyQuery(Statement stmt, String query) throws SQLException {
		return stmt.executeQuery(query);
	}

	public String printMyQueryResults(ResultSet rs) throws SQLException {

		int id, age, dob;
		id = age = dob = 0;

		String name, occupation, randomValue;
		name = occupation = randomValue = "";

		while (rs.next()) {
			id = rs.getInt(1);
			name = rs.getString(2);
			occupation = rs.getString(3);
			age = Integer.parseInt(rs.getString(4));
			dob = rs.getInt(5);
			randomValue = rs.getString(6);

		}
		return "id: " + id + " name: " + name + " occupation: " + occupation + " age " + age + " dob: " + dob
				+ " random: " + randomValue;
	}

}
