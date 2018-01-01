package com.raj.shashi.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author rajs
 *
 */
public class EmployeeResource {

	private static SessionFactory factory;

	public EmployeeResource() {
		// factory = new AnnotationConfiguration().configure().
		// // addPackage("com.xyz") //add package if used.
		// addAnnotatedClass(Employee.class).buildSessionFactory();

		factory = buildSessionFactory();
	}

	private static SessionFactory buildSessionFactory() {
		return new Configuration().addAnnotatedClass(Employee.class).configure().buildSessionFactory();
		// return new AnnotationConfiguration().configure(new
		// File("hibernate.cgf.xml")).buildSessionFactory();
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployee() {
		
		Session session=factory.openSession();
		return session.createQuery("From Employee").list();
	}

	public Employee getEmployeeByName(String name) {
		return null;
	}

	public void deleteEmployeeByName(String name) {

	}

	public void updateAgeByName(String name) {

	}

	public void insertToDB(Employee emp) {

		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();

	}

}
