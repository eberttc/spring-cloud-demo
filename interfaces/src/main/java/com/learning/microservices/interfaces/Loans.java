package com.learning.microservices.interfaces;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class Loans {

	private String type;
	private String customerId;
	private BigDecimal amount;
}
