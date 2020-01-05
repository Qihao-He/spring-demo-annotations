package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
//	@Autowired
//	@Qualifier("foo")
//	@Qualifier("RESTFortuneService")
//	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach inside default constructor.");
	}
	
    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
        this.fortuneService = fortuneService;
    }
    
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "tennis daily.";
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach inside setFortuneService() method.");
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void doSomeCrazy(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach inside doSomeCrazy() method.");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
