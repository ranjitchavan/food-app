package com.lazy.foodapp.reg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lazy.foodapp.customer.service.CustomerService;
import com.lazy.foodapp.pojo.Customer;

@RestController
@RequestMapping("/")
public class RegisterController {
	
	@Autowired
	CustomerService customerService;
	
	@CrossOrigin
	@PostMapping("/register")
	public ResponseEntity<Customer> registerUserInformation(@RequestBody Customer customer) {
		
		ResponseEntity<Customer> customerObj=customerService.registerCustomer(customer);
		return customerObj;
		
	}
	
	
}
