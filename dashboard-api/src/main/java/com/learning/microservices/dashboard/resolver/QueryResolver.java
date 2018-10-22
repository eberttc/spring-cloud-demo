package com.learning.microservices.dashboard.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.learning.microservices.dashboard.domain.CustomerInfo;
import com.learning.microservices.dashboard.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {

	@Autowired
	private CustomerService service;

	public CustomerInfo getCustomerInfo(String id){

		return service.getCustomerInfo(id);
	}
}
