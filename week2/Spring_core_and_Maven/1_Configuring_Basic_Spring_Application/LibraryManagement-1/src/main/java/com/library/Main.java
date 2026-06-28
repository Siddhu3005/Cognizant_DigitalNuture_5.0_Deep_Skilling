package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;
import com.library.services.BookService;
public class Main {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 BookService serv=context.getBean("bookService",BookService.class);
		 serv.service();
		 BookRepository repository = context.getBean("bookRepository", BookRepository.class);
	     repository.display();
	}
}
