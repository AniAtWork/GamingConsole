package com.springGame.console.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Ani";
	}
	@Bean
	public int age() {
		return 22;
	}
	@Bean
	public Person person() {
		var person = new Person("Tavi",23);
	return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age());
	}
}
