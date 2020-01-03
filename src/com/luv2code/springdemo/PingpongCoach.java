package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("pingpongCoach")
public class PingpongCoach implements Coach {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyWorkout() {
		return "Pingpong daily.";
	}

}
