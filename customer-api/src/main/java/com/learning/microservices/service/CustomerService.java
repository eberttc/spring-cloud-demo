package com.learning.microservices.service;

import com.learning.microservices.interfaces.Customer;
import com.learning.microservices.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

	Logger log= LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CustomerRepository customerRepository;

	@Value("${customer.api.list.currency}")
	private List<String> currencies;

	public List<Customer> findAll(){
		return customerRepository.findAll()
				.stream()
				.map(c -> Customer.builder()
						.id(String.valueOf(c.getId()))
						.firstName(c.getFirstName())
						.lastName(c.getLastName())
						.age(c.getAge())
						.build())
				.collect(Collectors.toList());
		//return null;
	}

	public Customer findById(String id){
		com.learning.microservices.domain.Customer customerById = customerRepository.findCustomerById(Long.valueOf(id));
		Customer c=new Customer(customerById.getId().toString(),customerById.getFirstName(),customerById.getLastName(),customerById.getAge());
		log.info("Currencies:{},{}",currencies.get(0),currencies.get(1));
		return c;
	}
}
