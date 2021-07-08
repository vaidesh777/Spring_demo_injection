package com.spring.demo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
		
	}
	
	
	
	
	@Override
	public String getDailyWorkout()
	{
	return "spend 30 minutes on batting practices";
	}
	
	
	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}
}
