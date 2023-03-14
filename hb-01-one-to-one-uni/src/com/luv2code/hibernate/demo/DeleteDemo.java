package com.luv2code.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import com.luve2code.hibernate.demo.entity.Student;


public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		

		try {
			
			
			session.beginTransaction();
			Instructor temp = session.get(Instructor.class, 2);
			
			System.out.println("Found : "+temp);
			
			if(temp != null) {
				System.out.println("deleted : " +temp);
				session.delete(temp);
			}
			
			
			
			session.getTransaction().commit();
			
		
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
