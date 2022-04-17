package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorldController obj = (HelloWorldController) context.getBean("helloWorld");
		obj.getMessage();
	}
}