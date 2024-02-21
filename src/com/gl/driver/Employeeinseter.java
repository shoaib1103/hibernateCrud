package com.gl.driver;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gl.entity.Employee;





public class Employeeinseter {
	
	public static void main(String[]args) {
		
		SessionFactory factory = (SessionFactory) new Configuration()
	                                .configure("hibernate.cfg.xml")
	                                .addAnnotatedClass(Employee.class)
	                                .buildSessionFactory();
		
		Session session = factory.openSession();
	
	try
	{
		Employee employee = new Employee("shoaib rafiq","anantapur","7013984337","shoaibrafiq34892@gmail.com");
		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		System.out.println("Inserted Employee Record Sucessfully");
		
	}
	finally {
		session.close();
		factory.close();
		
	}
	
	
	} 
	
	
	
	
	

}
