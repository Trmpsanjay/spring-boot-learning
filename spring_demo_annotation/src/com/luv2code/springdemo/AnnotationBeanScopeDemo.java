package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TennisCoach ttCoach = context.getBean("tennisCoach",TennisCoach.class);
		TennisCoach ttCoach1 = context.getBean("tennisCoach",TennisCoach.class);
		boolean isSame = (ttCoach==ttCoach1);
		System.out.println(isSame);
		System.out.println(ttCoach);
		System.out.println(ttCoach1);
		

	}

}
