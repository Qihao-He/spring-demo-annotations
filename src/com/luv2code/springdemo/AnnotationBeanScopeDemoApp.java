package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach1 = context.getBean("tennisCoach", Coach.class);
		Coach coach2 = context.getBean("tennisCoach", Coach.class);
		boolean result = (coach1 == coach2);
		System.out.println("Pointing to the same object: " + result);
		System.out.println("Memory location for coach1: " + coach1);
		System.out.println("Memory location for coach2: " + coach2);
		context.close();

	}

}
