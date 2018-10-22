package com.learning.microservices.dashboard.client;


import com.learning.microservices.interfaces.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "customer",path = "customers")
public interface CustomerClient {

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	Customer getCustomerById(@PathVariable("id") String id);
}
