package com.spring.demo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	
	private String EmailAddress;
	private String Team;

	// create no argument constructor

	public CricketCoach() {
		System.out.println("CricketCoach:no argument constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach:argument constructor");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public String getTeam() {
		return Team;
	}

	public void setEmailAddress(String EmailAddress) {
		System.out.println("CricketCoach:inside the setter method-emailaddress");
		this.EmailAddress = EmailAddress;
	}

	public void setTeam(String Team) {
		System.out.println("CricketCoach:inside the setter method-team");
		this.Team = Team;
	}
	
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "PRACTICE FOR BOWLING FOR 15 MINUTES";
	}

	
	
	
}
