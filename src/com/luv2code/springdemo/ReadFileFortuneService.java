package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class ReadFileFortuneService implements FortuneService {
	
	private String fileName = "/Users/qihaohe/eclipse-workspace/spring-demo-annotations/src/fortune-data.txt";
	private List<String> fortuneList;

	public ReadFileFortuneService() {
		File file = new File(fileName);
		System.out.println("Reading fortunes from file: " + file);
		System.out.println("Fiel exists: " + file.exists());
		fortuneList = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String tempLine;
			while((tempLine = br.readLine()) != null) {
				fortuneList.add(tempLine); 
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		int i = random.nextInt(fortuneList.size());
		String tempFortune = fortuneList.get(i);
		return tempFortune;
	}
	
	private Random random = new Random();
}
