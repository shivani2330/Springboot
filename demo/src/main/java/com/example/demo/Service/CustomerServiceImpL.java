package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.*;
import com.example.demo.Service.*;
import com.example.demo.model.*;

@Service
public class CustomerServiceImpL implements CustomerService {

@Autowired

CustomerDAO customerdao;

@Override
public void insertCustomer(Customers customer) {
	// TODO Auto-generated method stub
	customerdao.insertCustomer(customer);
}

@Override
public void insertCustomers(List<Customers> customers) {
	// TODO Auto-generated method stub
	customerdao.insertCustomers(customers);
	
}

@Override
public List<Customers> getAllCustomers() {
	// TODO Auto-generated method stub
	customerdao.getAllCustomers();
	return null;
}

@Override
public void getCustomerById(int cid) {
	// TODO Auto-generated method stub
	customerdao.getCustomerById(cid);
	
}



	
	
}
