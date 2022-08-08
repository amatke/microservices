package com.amigoscode.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public void registerCustomer(CustomerRegistrationRequest request) {
		Customer customer = Customer.builder()
			.firstName(request.firstName)
			.lastName(request.lastName)
			.email(request.email)
			.build();

		customerRepository.save(customer);
	}
}
