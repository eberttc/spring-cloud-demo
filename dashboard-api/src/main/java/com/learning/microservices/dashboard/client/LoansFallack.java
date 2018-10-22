package com.learning.microservices.dashboard.client;

import com.learning.microservices.interfaces.Loans;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoansFallack implements LoanClient {

	@Override
	public List<Loans> getLoansByCustomer(String id) {
		return new ArrayList<>();
	}
}
