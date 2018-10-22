/*
package com.learning.microservices.loanapi.service;

import com.learning.microservices.interfaces.Loans;
import com.learning.microservices.loanapi.domain.LoanDocument;
import com.learning.microservices.loanapi.repository.LoanMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

	@Autowired
	private LoanMongoRepository loanMongoRepository;

	public List<Loans> findLoanByCustomerID(String id){
		List<Loans> loans=new ArrayList<>();
		loanMongoRepository.findLoanDocumentsByCustomerId(id)
				.forEach(x -> {
					Loans l =new Loans();
					l.setAmount(x.getAmount());
					l.setCustomerId(x.getCustomerId());
					l.setType(x.getType());
					loans.add(l);
				});

		return loans;

	}

	public void saveLoan(LoanDocument doc){
		loanMongoRepository.save(doc);
	}
}
*/
