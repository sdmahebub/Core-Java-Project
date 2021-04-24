package com.abc.student;

public class Student {
	private int student_id;
	private String student_name;
	private long phone_no;
	private String email_id;
	private String department;
	
	public Student(int student_id, String student_name, long phone_no, String email_id, String department) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.phone_no = phone_no;
		this.email_id = email_id;
		this.department = department;
	}
	public Student() {
		
	}
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
