package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.services.BookService;
public class Main {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 BookService serv=context.getBean("bookService",BookService.class);
		 serv.service();
	}
}
