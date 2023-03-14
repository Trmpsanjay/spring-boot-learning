package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TennisCoach ttCoach = context.getBean("tennisCoach",TennisCoach.class);
		System.out.println(ttCoach.getDailyWorkOut());
		System.out.println(ttCoach.getFortune());
		
	}

}

