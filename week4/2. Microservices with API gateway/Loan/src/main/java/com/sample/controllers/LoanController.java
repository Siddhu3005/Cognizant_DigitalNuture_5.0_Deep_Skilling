package com.sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Loan;

@RestController
public class LoanController {
	@GetMapping("/loan")
	public Loan getLoanDetails() {
		return new Loan(183,"Home-Loan",2500000,8.5);
	}
}
