package com.product.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.*;
@Controller
public class ProductController {
	
	@Autowired 
	ProductService service;
	
	@RequestMapping("/")
	public String viewhome(Model mod)
	{
		List<Product> listofProduct = service.getAllProduct();
		mod.addAttribute("listofProduct", listofProduct);
		return "index";
	}

}
