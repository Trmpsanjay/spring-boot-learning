package com.luv2code.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

import com.luve2code.hibernate.demo.entity.Instructor;
import com.luve2code.hibernate.demo.entity.InstructorDetail;
import com.luve2code.hibernate.demo.entity.Student;


public class GetInstructorDemo {

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
			InstructorDetail temp = session.get(InstructorDetail.class, 3);
			
			System.out.println("Found : "+temp);
			
			if(temp != null) {
				System.out.println("Instructor Detail  : " +temp);
				System.out.println("Instructor : "+temp.getInstructor());

			}
			
			
			
			session.getTransaction().commit();
			
		
			

		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			session.close();
		}

	}

}
