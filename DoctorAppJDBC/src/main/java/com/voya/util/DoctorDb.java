package com.voya.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DoctorDb {

	
	    static Connection connection;

	    public static Connection OpenConnection() {
	    	try {
	    		Class.forName("com.mysql.jdbc.Driver");
	    	}catch (ClassNotFoundException e1) {
	    		e1.printStackTrace();
	    	}
	        String url = "jdbc:mysql://localhost:3306/voyatraining";
	        String username = "root";
	        String password = "root";

	        try {
	            connection = DriverManager.getConnection(url, username, password);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return connection;
	    }
	

	}


