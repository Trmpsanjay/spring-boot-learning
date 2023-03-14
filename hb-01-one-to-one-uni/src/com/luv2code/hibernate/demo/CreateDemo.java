package com.luv2code.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import com.luve2code.hibernate.demo.entity.Student;


public class CreateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		

		try {
			
			Instructor inst = new Instructor("Sanjay","Kumar","trmpsanjay@gmail.com");
			
			InstructorDetail insDetail = new InstructorDetail("https://youtube.com/trmpsanjay","Test to Spring boot");
			
			inst.setInstructorDetail(insDetail);
			
			session.beginTransaction();
			
			session.save(inst);
			
			session.getTransaction().commit();
			
			System.out.println("Saved : "+inst);
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
