package com.lazy.foodapp.customer.service;

import org.springframework.http.ResponseEntity;

import com.lazy.foodapp.pojo.Customer;

public interface CustomerService {
	
	public ResponseEntity<Customer> registerCustomer(Customer customer);
	public ResponseEntity<Customer> loginCustomerByMobileNo(Customer customer);
	public ResponseEntity<Customer> loginCustomerByEmailId(Customer customer);
	
}
