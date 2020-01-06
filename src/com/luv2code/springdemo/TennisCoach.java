package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
    
    @PostConstruct
    public void afterConstruct() {
    	System.out.println(">> TennisCoach: inside after constructor");
    }
    
    @PreDestroy
    public void beforeDestruct() {
    	System.out.println(">> TennisCoach: inside before destructor");
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
