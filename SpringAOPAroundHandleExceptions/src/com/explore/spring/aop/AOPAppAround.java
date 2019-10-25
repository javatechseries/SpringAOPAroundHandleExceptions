package com.explore.spring.aop;


import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.explore.spring.aop.services.TrafficFortuneService;


public class AOPAppAround {
	
	private static Logger myLogger = Logger.getLogger(AOPAppAround.class.getName());

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctxt= new AnnotationConfigApplicationContext(AppConfig.class);
		
		TrafficFortuneService fortuneService = ctxt.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		myLogger.info("In AOPAppAround ");
		
		myLogger.info("Calling getFortune()");
		
		boolean simulateException=true;
		
		String data= fortuneService.getFortune(simulateException);
		
		myLogger.info("Fortune is : "+data);
		
		myLogger.info("Done!!!!");
		
		ctxt.close();


	}

}
