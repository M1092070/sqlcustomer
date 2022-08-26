package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerService {
	Customer saveCustomer(Customer customer);
	
	List<Customer>getAllCustomerr();
	Customer getCustomerById(long id);

	

}
