package com.luv2code.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

import com.luve2code.hibernate.demo.entity.Course;
import com.luve2code.hibernate.demo.entity.Instructor;
import com.luve2code.hibernate.demo.entity.InstructorDetail;
import com.luve2code.hibernate.demo.entity.Student;


public class CreateInstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		

		try {
			
			Instructor inst = new Instructor("Snjay","Kumar","tmpsanjay@gmail.com");
			
			InstructorDetail insDetail = new InstructorDetail("https://youtube.com/tmpsanjay","Test to Spring");
			
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
