package com.learning.microservices.dashboard.service;


import com.learning.microservices.dashboard.client.CustomerClient;
import com.learning.microservices.dashboard.client.LoanClient;
import com.learning.microservices.dashboard.domain.CustomerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class CustomerService {

	@Autowired
	CustomerClient customerClient;

	@Autowired
	LoanClient loanClient;

	@Value("${dashbord.message.greeting}")
	private String greeting;

	public CustomerInfo getCustomerInfo(String id){
		CustomerInfo customerInfo=new CustomerInfo();
		customerInfo.setCustomer(customerClient.getCustomerById(id));
		customerInfo.setLoans(loanClient.getLoansByCustomer(id));
		customerInfo.setMessage(greeting);
		return customerInfo;
	}
}
