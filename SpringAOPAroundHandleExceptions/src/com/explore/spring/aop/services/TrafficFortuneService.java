package com.explore.spring.aop.services;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {
	
	
	
	public String getFortune() {
		
		//simulate delay 
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Expect delays due to simulation";
		
	}

	public String getFortune(boolean simulateException) {
		
		if(simulateException)
		{
			throw new RuntimeException("SimulatedException");
		}
		return getFortune();
	}

}
