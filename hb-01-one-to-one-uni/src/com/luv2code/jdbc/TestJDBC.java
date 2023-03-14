package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
		String username = "hbstudent";
		String password = "hbstudent";
		
		try {
			System.out.println("Connection to JDBC : "+jdbcUrl);
			Connection conn =  DriverManager.getConnection(jdbcUrl,username,password);
			System.out.println(conn);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
