package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luve2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		

		try {
			
//			Student st1 = new Student("Sanjay","Kumar","trmpsanjay@gmail.com");
//			Student st2 = new Student("Jay","Kumar","jay@gmail.com");
//			
			session.beginTransaction();
//			Student st3 = session.get(Student.class, 2);
			
			
			// querying
			
			List<Student> stList = session.createQuery("from Student where 1=1").getResultList();
			for(Student st_det: stList) {
				System.out.println(st_det);
			}
			session.getTransaction().commit();
			System.out.println();
//			System.out.println("Saved : "+st3);
			

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
