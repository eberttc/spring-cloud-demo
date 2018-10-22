package com.learning.microservices.loanapi.controller;


import com.learning.microservices.interfaces.Loans;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "loans")
@Slf4j
public class LoanController {

	public static List<Loans> loans = new ArrayList<Loans>();

/*
	@Autowired
	private LoanService loanService;*/

	static {
		Loans loan1 =new Loans();
		loan1.setAmount(new BigDecimal(1000));
		loan1.setType("STUDENT");
		loan1.setCustomerId("1");
		loans.add(loan1);

		Loans loan2 =new Loans();
		loan2.setAmount(new BigDecimal(1000));
		loan2.setType("Mortgages");
		loan2.setCustomerId("1");
		loans.add(loan2);

		Loans loan3 =new Loans();
		loan3.setAmount(new BigDecimal(1000));
		loan3.setType("Personal");
		loan3.setCustomerId("2");
		loans.add(loan3);
	}

	@GetMapping("/{id}")
	public List<Loans> getLoandByClient(@PathVariable String id){
		log.info("Get Loans of user {}",id);
		return loans.stream()
				.filter(x -> x.getCustomerId().equals(id))
				.collect(Collectors.toList());
	}
/*
	@GetMapping("user/{id}")
	public List<Loans> getLoandByUser(@PathVariable String id){
		log.info("Get Loans of user {}",id);
		return loanService.findLoanByCustomerID(id);
	}*/
}
