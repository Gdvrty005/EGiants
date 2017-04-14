package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.OrdersDao;
import com.example.model.Customers;
import com.example.model.Orders;

@RestController
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrdersDao ordersDao;
	
	@RequestMapping("/all")
	public List<Orders> getAllOrders(){
		return ordersDao.findAll();
	}
	
	@RequestMapping("/{orderId}")
	public Orders getOneOrder(@PathVariable int orderId){
		return ordersDao.findOne(orderId);
	}
	
	@RequestMapping("{customerId}/all")
	public List<Orders> getCustomerOrders(@PathVariable Customers customerId){
		return ordersDao.findByCustomer(customerId);
	}
}
