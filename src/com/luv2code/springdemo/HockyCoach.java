package com.luv2code.springdemo;

public class HockyCoach implements Coach {
	
	private FortuneService fortuneService;

	public HockyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "hocky daily.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
