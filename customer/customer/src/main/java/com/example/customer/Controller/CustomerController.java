package com.example.customer.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.example.customer.Model.*;
import com.example.customer.Service.*;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class CustomerController {
	@Autowired
	CustomerService customerservice;
	
	@GetMapping("/home")
	public String homepage(Model model) {
		model.addAttribute("ListofCustomers", customerservice.getAllCustomers());
		return "index";
	}
	@GetMapping("/showCustomers")
	
	public String showCustomers(@ModelAttribute("customer") Customer customer) {
		return "new_customer";
	}
	
	@PostMapping("/saveCustomer")
	
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerservice.saveCustomer(customer);
		return "redirect:/home";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	
	public String updateForm(@PathVariable ( value = "id") int id,Model model) {
		  // get employee from the service
		Customer customer = customerservice.getcustomerByid(id);
		// set employee as a model attribute to pre-populate the form
		model.addAttribute("customer", customer);
		return"update_form";
	}
	
	@GetMapping("/deleteform/{id}")
	
	public String deleteform(@PathVariable ( value = "id") int id) {
		this.customerservice.deleteCustomerById(id);
		return "redirect:/home";
	}

}
