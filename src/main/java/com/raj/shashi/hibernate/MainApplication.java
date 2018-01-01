package com.raj.shashi.hibernate;

/**
 * @author rajs
 *
 */
public class MainApplication {

	public static void main(String[] args) {
		EmployeeResource res = new EmployeeResource();
		res.getAllEmployee().stream().forEach(emp -> {
			System.out.println(emp);
		});
		
//		Employee emp= new Employee();
//		emp.setAge(23);
//		emp.setGender("male");
//		emp.setName("shashi Raj");
//		res.insertToDB(emp);
	}

}
