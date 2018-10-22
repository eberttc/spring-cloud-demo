package com.learning.microservices.loanapi;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class LoanApiApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(LoanApiApplication.class, args);
	}

/*	@Autowired
	private LoanService loanService;*/

	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*LoanDocument loan1=new LoanDocument();
		loan1.setAmount(new BigDecimal(1000));
		loan1.setType("STUDENT");
		loan1.setCustomerId("1");

		LoanDocument loan2 =new LoanDocument();
		loan2.setAmount(new BigDecimal(1000));
		loan2.setType("Mortgages");
		loan2.setCustomerId("1");

		LoanDocument loan3 =new LoanDocument();
		loan3.setAmount(new BigDecimal(1000));
		loan3.setType("Personal");
		loan3.setCustomerId("2");

		loanService.saveLoan(loan1);
		loanService.saveLoan(loan2);
		loanService.saveLoan(loan3);*/
	}
}
