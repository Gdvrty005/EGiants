package com.example.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Customers;
import com.example.model.Orders;

public interface OrdersDao extends CrudRepository<Orders, Integer>{
	
	List<Orders> findAll();
	List<Orders> findByCustomer(Customers customerId);

}
