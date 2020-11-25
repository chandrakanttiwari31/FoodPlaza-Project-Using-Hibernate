package com.hibernate.food.dao;

import java.util.List;

import com.hibernate.food.entity.Customer;

public interface CustomerDao {

	boolean addCustomer(Customer c);
	boolean updateCustomer(Customer c);
	
	boolean deleteCustomer(int custId);
	 Customer getCustomer( int custId);
	 List<Customer> getAllCutomer();
	
	
}
