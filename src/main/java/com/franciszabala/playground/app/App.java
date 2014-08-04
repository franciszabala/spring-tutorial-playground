package com.franciszabala.playground.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.franciszabala.playground.Aquarium;
import com.franciszabala.playground.GreeterOfDeveloper;
import com.franciszabala.playground.HelloWorld;

public class App {
	
	public static void main (String args[]) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld) appContext.getBean("helloWorld");
		
		
		System.out.println(helloWorld.toString());
		
		GreeterOfDeveloper greeter = (GreeterOfDeveloper) appContext.getBean("greeterOfDeveloper");
		greeter.greetDeveloper();
		
//		Corydoras cory = new Corydoras();
//		
//		cory.setRespire(new WaterRespiration());
//		
//		cory.getRespire().inhale("oxygen");
//		cory.getRespire().exhale();
		
		Aquarium aquarium = (Aquarium) appContext.getBean("livingRoomAquarium");
		System.out.println(aquarium.toString());
		
		((ClassPathXmlApplicationContext) appContext).close();
	
	}

}
