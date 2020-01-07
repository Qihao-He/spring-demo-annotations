package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HockyJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		HockyCoach coach = context.getBean("hockyCoach", HockyCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
//		System.out.println(coach.getEmail());
//		System.out.println(coach.getTeam());
		context.close();
	}

}
