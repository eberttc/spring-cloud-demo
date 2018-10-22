package com.learning.microservices.dashboard.client;

import com.learning.microservices.interfaces.Loans;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "loans",path = "loans",fallback = LoansFallack.class)
public interface LoanClient {

	@RequestMapping(path = "/{id}",method = RequestMethod.GET)
	List<Loans> getLoansByCustomer(@PathVariable("id") String id);
}
