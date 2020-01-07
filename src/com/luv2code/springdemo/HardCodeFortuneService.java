package com.luv2code.springdemo;

public class HardCodeFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Hard code fortune.";
	}

}
