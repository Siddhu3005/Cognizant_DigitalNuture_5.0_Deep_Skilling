package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.model.Model;

@SpringBootApplication
public class SpringLearn1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearn1Application.class, args);
		displayCountry();
	}
	public static void displayCountry() {
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		Model country=context.getBean("country",Model.class);
		System.out.println(country);
		
	}

}
