package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoapp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScopeLifeCycle-applicationContext.xml"); 
        
		Coach theCoach=context.getBean("myCoach",coach.class);
		
		context.close();
		
		
		
		
		
	}

}
