package com.amigoscode.fraud;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraudCheckHistoryService {

	@Autowired
	private FraudCheckHistoryRepository fraudCheckHistoryRepository;

	public boolean isFraudulentCustmer(Integer customerId){

		fraudCheckHistoryRepository.save(FraudCheckHistory.builder()
				.customerId(customerId)
				.isFraudster(false)
				.createdAr(LocalDateTime.now())
			.build());

		return false;
	}
}
