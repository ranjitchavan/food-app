package com.lazy.foodapp.customer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lazy.foodapp.customer.repo.CustomerRepository;
import com.lazy.foodapp.exception.InvalidRegisterInformationException;
import com.lazy.foodapp.exception.LoginFailedException;
import com.lazy.foodapp.pojo.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public ResponseEntity<Customer> registerCustomer(Customer customer) {
		if (customer != null)
			customer = customerRepository.save(customer);
		else
			throw new InvalidRegisterInformationException();
		return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Customer> loginCustomerByMobileNo(Customer customer) {
		Optional<Customer> cuOptional = null;

		if (customer != null)
			cuOptional = customerRepository.findByMobileNoAndPassword(customer.getMobileNo(),customer.getPassword());
		else
			throw new LoginFailedException();

		if (cuOptional != null &&  cuOptional.isPresent())
			return new ResponseEntity<Customer>(cuOptional.get(), HttpStatus.ACCEPTED);
		else
			throw new LoginFailedException("Invalid Login credentials ");

	}

	@Override
	public ResponseEntity<Customer> loginCustomerByEmailId(Customer customer) {
		Optional<Customer> cuOptional = null;

		if (customer != null)
			cuOptional = customerRepository.findByEmailAndPassword(customer.getEmail(),customer.getPassword());
		else
			throw new LoginFailedException();

		if (cuOptional != null && cuOptional.isPresent())
			return new ResponseEntity<Customer>(cuOptional.get(), HttpStatus.ACCEPTED);
		else
			throw new LoginFailedException("Invalid Login credentials");
	}

}
