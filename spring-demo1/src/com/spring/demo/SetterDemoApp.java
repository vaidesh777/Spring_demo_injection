package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml)");

		Coach thecoach = context.getBean("myCricketCoach", CricketCoach.class);

		System.out.println(thecoach.getDailyWorkout());
		
		System.out.println(thecoach.getDailyFortune());
		
		System.out.println(thecoach.getEmailaddress());
		System.out.println(thecoach.getTeam());
		
		
		
		
		
		
		
		

		context.close();
		
		
		
	}

}
