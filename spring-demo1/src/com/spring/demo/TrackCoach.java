package com.spring.demo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    
    public TrackCoach(FortuneService theFortuneService)
    {
    	fortuneService=theFortuneService;
    }
    
	@Override
	public String getDailyWorkout() {
		return "run a hard 5k";
	}
		
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public void doMyStartupStuff()
	{
		System.out.println("theCoach:inside method domystartupstuff");
	}
	
	public void doMyCleanupStuff()
	{
		System.out.println("theCoach:inside method domycleanupstuff");
	}
	
	
	
	
}
