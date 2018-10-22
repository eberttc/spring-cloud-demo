package com.learning.microservices.dashboard.domain;

import com.learning.microservices.interfaces.Customer;
import com.learning.microservices.interfaces.Loans;
import lombok.Data;

import java.util.List;

@Data
public class CustomerInfo {
	private Customer customer;
	private List<Loans> loans;
	private String message;
}
