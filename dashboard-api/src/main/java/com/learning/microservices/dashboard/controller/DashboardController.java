package com.learning.microservices.dashboard.controller;

import com.learning.microservices.dashboard.domain.CustomerInfo;
import com.learning.microservices.dashboard.resolver.QueryResolver;
import com.learning.microservices.dashboard.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dashboard")
@Slf4j
public class DashboardController {

	@Autowired
	private CustomerService service;

	/*@Autowired
	private QueryResolver queryResolver;*/
	@GetMapping("users/{id}")
	public CustomerInfo getInfo(@PathVariable String id){
		log.info("Get Info Customer {}",id);
		return service.getCustomerInfo(id);
		//return queryResolver.getCustomerInfo(id);
	}
}
