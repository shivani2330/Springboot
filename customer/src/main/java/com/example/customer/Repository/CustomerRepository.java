package com.example.customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.customer.Model.*;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
