package com.amigoscode.customer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FraudCheckResponse {

	public boolean isFraudster;

}
