package com.abc.student;

import java.util.*;

public class Launch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student s = new Student();
		List<Student> details = new ArrayList<Student>();
		System.out.println("No. of records want to insert");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("enter the id");
			s.setStudent_id(scan.nextInt());
			System.out.println("enter the name");
			s.setStudent_name(scan.next());
			System.out.println("enter the phone");
			s.setPhone_no(scan.nextInt());
			System.out.println("enter the email");
			s.setEmail_id(scan.next());
			System.out.println("enter the department");
			s.setDepartment(scan.next());
			details.add(s);
		}
		System.out.println("Enter the id to retrieve the details of student");
		int id = scan.nextInt();
		for(int i =0;i<=details.size()-1;i++) {
			if(id==s.getStudent_id()) {
				System.out.println(s.getStudent_id());
				System.out.println(s.getStudent_name());
				System.out.println(s.getPhone_no());
				System.out.println(s.getEmail_id());
				System.out.println(s.getDepartment());
				break;
			}
			else {
				System.out.println("Invalid Id");
				break;
			}
		}
	}
}
