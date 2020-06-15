package com.example.demo.DAO;

import java.util.List;

import com.example.demo.model.*;
public interface CustomerDAO {
	
	void insertCustomer(Customers customer);
	void insertCustomers(List<Customers> customer);
	List<Customers> getAllCustomers();
	Customers getCustomerById(int cid);

}
