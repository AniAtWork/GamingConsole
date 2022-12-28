package com.springGame.console.helloWorld;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	
	public static void main(String[] args)throws IOException {
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
	
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("person2MethodCall"));
	}
}
