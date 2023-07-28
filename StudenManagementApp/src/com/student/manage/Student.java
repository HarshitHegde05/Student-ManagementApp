package com.student.manage;

public class Student {
	private int Sid;
	private String Sname;
	private String SPhone;
	private String SCity;
	
	public Student(int Sid,String Sname,String SPhone,String SCity) {
		this.Sid=Sid;
		this.Sname=Sname;
		this.SPhone=SPhone;
		this.SCity=SCity;
	}
	public Student(String Sname,String SPhone,String SCity) {
		this.Sname=Sname;
		this.SPhone=SPhone;
		this.SCity=SCity;
	}
	public Student() {

	}
	public int getSid() {
		return this.Sid;
	}
	public void setSid(int Sid) {
		this.Sid=Sid;
	}
	public String getSname() {
		return this.Sname;
	}
	public void setSname(String Sname) {
		this.Sname=Sname;
	}
	public String getSPhone() {
		return this.SPhone;
	}
	public void setSPhone(String SPhone) {
		this.SPhone=SPhone;
	}
	public String getSCity() {
		return this.SCity;
	}
	public void setSCity(String SCity) {
		this.SCity=SCity;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", SPhone=" + SPhone + ", SCity=" + SCity + "]";
	}
	

}
