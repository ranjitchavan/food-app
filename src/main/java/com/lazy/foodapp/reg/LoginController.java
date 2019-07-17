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
public class LoginController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customer/login/bymobile")
	@CrossOrigin
	public ResponseEntity<Customer> loginCustomerByMobileNumber(@RequestBody Customer customer){
		
		
		return customerService.loginCustomerByMobileNo(customer);
	}
	@PostMapping("/customer/login/byemail")
	@CrossOrigin
	public ResponseEntity<Customer> loginCustomerByEmail(@RequestBody Customer customer){
	
		
		return customerService.loginCustomerByEmailId(customer);
	}
	
}
