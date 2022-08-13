package com.amigoscode.fraud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/v1/fraud-check")
@Slf4j
public class FraudController {

	@Autowired
	private FraudCheckHistoryService fraudCheckHistoryService;
	
	@GetMapping(path = "{customerId}")
	public FraudCheckResponse isFraudster(@PathVariable ("customerId") Integer customerId){

		boolean isFraudulentCustomer = fraudCheckHistoryService.isFraudulentCustmer(customerId);

		log.info("Fraud check request for customer {} ", customerId);
		FraudCheckResponse fraudCheckResponse = FraudCheckResponse.builder().isFraudster(isFraudulentCustomer).build();

		return fraudCheckResponse;
	}
}
