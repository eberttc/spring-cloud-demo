package com.learning.microservices.controller;


import com.learning.microservices.interfaces.Customer;
import com.learning.microservices.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {

	@Value("${customer.api.message.info}")
	private String message;

	public static Map customers = new HashMap<String,Customer>();

	@Autowired
	private CustomerService customerService;
	static{
		Customer customer =new Customer();
		customer.setFirstName("Ebert");
		customer.setLastName("Toribio");
		customer.setAge(12);
		customer.setId("1");
		customers.put("1",customer);


		Customer customer2 =new Customer();
		customer2.setFirstName("Juan");
		customer2.setLastName("Torres");
		customer2.setAge(12);
		customer2.setId("2");
		customers.put("2",customer2);

	}

	@GetMapping(path = "/{id}")
	public Customer list(@PathVariable String id){
		log.info("Get Customers {}:{}",message,id);
		//return (Customer) customers.get(id);
		return customerService.findById(id);
	}
	@GetMapping()
	public List<Customer> getAll(){
		return customerService.findAll();
	}
}
