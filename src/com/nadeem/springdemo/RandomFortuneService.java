package com.nadeem.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {"YOLO", "You need to watch your back!", "You might get lucky today ;-)"};

	@Override
	public String getFortune() {
		Random myRandom = new Random();
		System.out.println("Generating random fortune.");
		return fortunes[myRandom.nextInt(3)];
	}

}
