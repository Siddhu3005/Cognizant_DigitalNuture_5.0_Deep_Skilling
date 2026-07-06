package com.sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Account;

@RestController
public class AccountController {
	@GetMapping("/account")
	public Account getAccountDetails() {
		return new Account(264,"Siddharth","Savings..",450000.00);
	}
}
