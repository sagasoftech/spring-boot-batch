package com.sagasoftech.springboot.batch.repository;

import com.sagasoftech.springboot.batch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
