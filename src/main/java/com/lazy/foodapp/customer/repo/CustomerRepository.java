package com.lazy.foodapp.customer.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lazy.foodapp.pojo.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	public Optional<Customer> findByMobileNoAndPassword(String email,String password);
	public Optional<Customer> findByEmailAndPassword(String mobileNo,String password);
}
