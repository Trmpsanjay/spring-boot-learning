package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import javax.annotation.*;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
//	@Qualifier("className") if more than one class implementing fortuneService
	private FortuneService fortuneService;
//	//@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		super();
//		this.fortuneService = fortuneService;
//	}
	
	public TennisCoach() {
		System.out.println("Hello from tennis coach constructor");
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Hello from tennis coach";
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("Hello from tennis coach set fortuneservice");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	@PostConstruct
	public void init() {
		System.out.println("Hello from init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Hello from destroy");
	}

}
