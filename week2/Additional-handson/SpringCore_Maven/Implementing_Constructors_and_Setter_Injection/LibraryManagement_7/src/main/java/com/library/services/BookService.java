package com.library.services;

import com.library.repository.BookRepository;

public class BookService {
	 	private BookRepository repository;
	    private String libraryName;
	    // Constructor Injection
	    public BookService(String libraryName) {
	        this.libraryName=libraryName;
	    }
	    // Setter Injection
	    public void setRepository(BookRepository repository) {
	        this.repository=repository;
	    }
		public void service() {
			System.out.println("Library Name : " + libraryName);
			repository.getBookDetails();
		}
}
