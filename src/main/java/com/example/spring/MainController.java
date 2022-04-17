package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {
	public static void main(String[] args) {
		HelloWorldController obj = new HelloWorldController();
		obj.setMessage("Hi dev!");
		obj.getMessage();
	}
}