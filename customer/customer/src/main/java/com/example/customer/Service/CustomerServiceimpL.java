package com.example.customer.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.example.customer.Repository.*;
import com.example.customer.Model.*;

@Service
public class CustomerServiceimpL implements CustomerService {

	@Autowired
	CustomerRepository customerrepository;

	@Override
	public List<Customer> getAllCustomers() {
		return customerrepository.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerrepository.save(customer);
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public Customer getcustomerByid(int id) {
		   Optional < Customer > optional = customerrepository.findById(id);
	        Customer customer = null;
	        if (optional.isPresent()) {
	           customer = optional.get();
	        } else {
	            throw new RuntimeException(" Customer not found for id :: " + id);
	        }
	        return customer;
	    }

	@Override
	public void deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		this.customerrepository.deleteById(id);
		
	}
	
	
}

	

	
	
