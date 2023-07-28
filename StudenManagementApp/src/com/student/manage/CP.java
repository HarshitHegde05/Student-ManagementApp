package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
	public static Connection createC() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage", "root", "Harshit@1234");	
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
