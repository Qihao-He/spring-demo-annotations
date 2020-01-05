package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	@Autowired
	@Qualifier("RESTFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;

	public SwimCoach() {
		System.out.println(">> inside SwimCoach default constructor.");
		System.out.println(">> SwimCoach email: " + this.email);
		System.out.println(">> SwimCoach team: " + this.team);
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim daily.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	

}
