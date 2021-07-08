package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml)");

		Coach thecoach = context.getBean("myCoach", Coach.class);

		System.out.println(thecoach.getDailyWorkout());

		context.close();
	}
	
}
