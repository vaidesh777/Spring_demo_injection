package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoapp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml"); 
        
		Coach theCoach=context.getBean("myCoach",coach.class);
		Coach alphaCoach=context.getBean("myCoach",coach.class);
		boolean result=(theCoach==alphaCoach);
		
		System.out.println("\npointting to the same object"+result);
		System.out.println("\nmemory location for thecoach"+theCoach);
		System.out.println("\nmemory location for alphacoach"+alphaCoach);
		
		context.close();
		
		
		
		
		
	}

}
