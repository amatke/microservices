package com.amigoscode.customer;

import lombok.Data;

@Data
public class CustomerRegistrationRequest {
	String firstName;
	String lastName;
	String email;

}