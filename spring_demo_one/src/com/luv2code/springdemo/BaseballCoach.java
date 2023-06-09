package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	public FortuneService getFortuneService() {
		return fortuneService;
	}



	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkut() {
		return "Spend 30 minutes on batting practice";
	}

	
}
