package com.example.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Customers;

@Transactional
@Repository
public interface CustomersDao extends CrudRepository<Customers, Integer>{
	
	List<Customers> findAll();
}
