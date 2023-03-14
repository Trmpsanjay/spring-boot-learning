package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
//		TennisCoach ttCoach = context.getBean("tennisCoach",TennisCoach.class);
		SwimCoach swimCoach = context.getBean("swimCoach",SwimCoach.class);
		System.out.println(swimCoach.getDailyWorkOut());
		System.out.println(swimCoach.getFortune());
		System.out.println(swimCoach.getTeamName());
		System.out.println(swimCoach.getTeamEmail());
		context.close();

	}

}
