package com.student.manage;
import java.sql.*;

public class StudentDao {
	public static boolean InsertStudentintoDB(Student st) {
	boolean f=false;
		try {
		Connection con=CP.createC();
		String insert="insert into students(sname,sphone,scity) values(?,?,?)";
		PreparedStatement pre=con.prepareStatement(insert);
		pre.setString(1, st.getSname());
		pre.setString(2, st.getSPhone());
		pre.setString(3, st.getSCity());
		pre.executeUpdate();
		f=true;
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		return f;
		
		
	}

	public static boolean deleteStudentDetails(int userId) {
		boolean f=false;
		try {
			Connection con=CP.createC();
			String delete="delete from students where sid=(?)";
			PreparedStatement pre=con.prepareStatement(delete);
			pre.setInt(1,userId);
			pre.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static void displayStudentDetails() {
		
		try {
			Connection con=CP.createC();
			String display="select * from students";
			Statement st=con.createStatement();
			ResultSet set=st.executeQuery(display);
			 while (set.next()) {		
				 int id=set.getInt(1);
				 String name=set.getString(2);
				 String phone=set.getString(3);
				 String city=set.getString(4);
				 System.out.println("ID "+id);
				 System.out.println("NAME "+name);
				 System.out.println("PhONE "+phone);
				 System.out.println("CITY "+city);
				 System.out.println("________________________________");
			 }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static boolean updatestudentdetails(Student st) {
		boolean f=false;
	try {
		Connection con=CP.createC();
		String update="update students set sname=?,sPhone=?,sCity=? where sid=?";
		PreparedStatement pre=con.prepareStatement(update);
		pre.setString(1, st.getSname());
		pre.setString(2,st.getSPhone());
		pre.setString(3, st.getSCity());
		pre.setInt(4, st.getSid());
		pre.executeUpdate();
		f=true;
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return f;
	}


}
