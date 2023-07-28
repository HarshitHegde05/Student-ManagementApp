package com.studentmanagementapp;
import java.io.*;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {
	public static void main(String []args) throws IOException {
		System.out.println("Welcome To Student Management app");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 To Add Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Display Student");
			System.out.println("Press 4 to Update Student");
			System.out.println("Press 5 to Exit!!!");
			int get=Integer.parseInt(br.readLine());
			
			if(get==1) {
				System.out.println("Student Name");
				String name=br.readLine();
				System.out.println("Student Phone");
				String phone=br.readLine();
				System.out.println("Student City");
				String city=br.readLine();
				Student st=new Student(name,phone,city);
				System.out.println(st);
				
				boolean result=StudentDao.InsertStudentintoDB(st);
				if(result) {
					System.out.println("Successfully Added ");
				}
				else {
					System.out.println("Something went Wrong");
				}
				
			}
			else if(get==2) {
				System.out.println("Enter Student Id to delete: ");
				int UserId=Integer.parseInt(br.readLine());
				
				boolean result=StudentDao.deleteStudentDetails(UserId);
				if(result) {
					System.out.println("Successfully deleted");
				}
				else {
					System.out.println("Something went wrong");
				}
				
			}
			else if(get==3) {
				StudentDao.displayStudentDetails();
			}
			else if(get==4) {
				System.out.println("Enter the details You Want to Update");
				System.out.println("Student ID");
				int ID=Integer.parseInt(br.readLine());
				System.out.println("Student Name");
				String name=br.readLine();
				System.out.println("Student Phone");
				String phone=br.readLine();
				System.out.println("Student City");
				String city=br.readLine();
				Student st=new Student(ID,name,phone,city);
				boolean b=StudentDao.updatestudentdetails(st);
				if(b) {
					System.out.println("Update Successful");
				}
				else {
					System.out.println("Something went Wrong");
				}
			}
			else if(get==5) {
				break;
			}
			else {
				try {
					System.out.println("Please enter Valid number");
					get=Integer.parseInt(br.readLine());	
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		}
	}

}
