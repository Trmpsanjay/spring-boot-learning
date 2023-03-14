package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private String teamEmail;
	private String team;
	public String getTeamEmail() {
		return teamEmail;
	}

	public void setTeamEmail(String teamEmail) {
		this.teamEmail = teamEmail;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	private FortuneService fortuneService;

	public String getFortuneService() {
		return fortuneService.getFortune()+" from CricketCoach";
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("This is called by setter injection");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkut() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void init() {
		System.out.println("This is init method");
	}
	public void destroy() {
		System.out.println("This is destroy method");
	}

}
