package com.example.demo.Service;

import com.example.demo.model.*;
import java.util.*;
public interface CustomerService {
	
	void insertCustomer(Customers customer);
	void insertCustomers(List<Customers> customer);
	List<Customers> getAllCustomers();
	void getCustomerById(int cid);
	
}
