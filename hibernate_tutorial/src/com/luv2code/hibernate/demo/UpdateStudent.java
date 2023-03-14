package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luve2code.hibernate.demo.entity.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		

		try {
			
	
			session.beginTransaction();
			Student st3 = session.get(Student.class, 2);
			st3.setEmail("testupdate@gmail.com");
			
			
			// using query
			
			int updateSt = session.createQuery("update Student set email='abc@bcd.com' where id = 2").executeUpdate();
			
			System.out.println("update resp : "+updateSt);
			
			
			session.getTransaction().commit();
			System.out.println("Saved : "+st3);
			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
