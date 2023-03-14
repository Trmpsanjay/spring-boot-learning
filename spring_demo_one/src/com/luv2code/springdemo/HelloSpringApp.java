package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);
		BaseballCoach bBCoach = context.getBean("myBBCoach", BaseballCoach.class);
		Coach bMCoach = context.getBean("myBMCoach", Coach.class);
		CricketCoach ccCoach = context.getBean("cricketCoach", CricketCoach.class);
		System.out.println(theCoach.getDailyWorkut());
		System.out.println(bBCoach.getDailyWorkut());
		System.out.println(bMCoach.getDailyWorkut());
		System.out.println(bBCoach.getFortuneService().getFortune());
		System.out.println(ccCoach.getFortuneService());
		System.out.println(ccCoach.getFortuneService());
		System.out.println(ccCoach.getTeam());
		System.out.println(ccCoach.getTeamEmail());

	}

}
