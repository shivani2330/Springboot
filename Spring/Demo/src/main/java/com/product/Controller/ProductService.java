package com.product.Controller;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
@Service
public class ProductService {
	
	@Autowired
	ProductRepository repo;
	
	public List<Product> getAllProduct()
	{
		return repo.findAll();
	}
	public void addProduct(Product product)
	{
		repo.save(product);
	}
	
	public void deleteProduct(long id)
	{
		repo.deleteById(id);
	}
	
}
