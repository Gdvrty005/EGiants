package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedNativeQuery(name="customerNames",query="select * from Customers", resultClass=Customers.class)
@Table(name="customers")
public class Customers {


	@Id
	@Column(name="customerId")
	private int customerId;
	@Column(name="customerName")
	private String customerName;
	@Column(name="customerCity")
	private String customerCity;
	
	public Customers() {
		
	}
	
	
	public Customers(int customerId, String customerName, String customerCity) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	
}
