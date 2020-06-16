package com.example.customer.Service;

import com.example.customer.Model.*;
import com.example.customer.Repository.*;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public interface CustomerService {
	List<Customer> getAllCustomers();
	void saveCustomer(Customer customer);
	Customer getcustomerByid(int id);
	void deleteCustomerById(int id);
}
