package com.luv2code.hibernate.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import com.luve2code.hibernate.demo.entity.Student;


public class CreateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		

		try {
			
			Student st1 = new Student("Sanjay","Kumar","trmpsanjay@gmail.com");
			Student st2 = new Student("Jay","Kumar","jay@gmail.com");
			
			session.beginTransaction();
			session.save(st1);
			session.save(st2);
			session.getTransaction().commit();
			System.out.println("Saved : "+st1);
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
