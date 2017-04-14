package com.example.controllers;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.CustomersDao;
import com.example.model.Customers;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private CustomersDao custDao;

	@RequestMapping("/hi")
	public String sayHi(){
		return "Spring MySql App"; 
	}
	
	@RequestMapping("/all")
	public List<Customers> getAllCustomers(){
		return custDao.findAll();
		
		
//		Session session;
//		try {
//		    session = sessionFactory.getCurrentSession();
//		} catch (HibernateException e) {
//		    session = sessionFactory.openSession();
//		}
//		session.beginTransaction();
//		
//		Query query = session.getNamedQuery("customerNames");
//		
//		List<Customers> custs = (List<Customers>) query.list();
//		
//		session.close();
//		return custs;
		
	}
	
	@RequestMapping("/{customerId}")
	public Customers getOneCustomer(@PathVariable int customerId){
		return custDao.findOne(customerId);
//		Session session;
//		try {
//		    session = sessionFactory.getCurrentSession();
//		} catch (HibernateException e) {
//		    session = sessionFactory.openSession();
//		}
//		session.beginTransaction();
//		
//		String hql = "select * from Customers where customerId = :id";
//		Customers cust = (Customers) session.createSQLQuery(hql).setParameter("id", id).list().get(0);
//		
//		return cust;
		
		
	}
}
