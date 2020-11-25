package com.hibernate.food.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.book.utility.DbConnection;
import com.hibernate.food.dao.CustomerDao;
import com.hibernate.food.entity.Customer;

public class CustomerDaoImpl implements CustomerDao {

	Session session;
	Transaction tr=null;
	
	List<Customer> list=new ArrayList<>();
	
	
	
	@Override
	public boolean addCustomer(Customer c) {
		session=DbConnection.getSession();
		tr=session.beginTransaction();
		
		session.save(c);
		tr.commit();
		session.close();
		return false;
		
	}

	@Override
	public boolean updateCustomer(Customer c) {
		session=DbConnection.getSession();
		tr=session.beginTransaction();
		
		session.update(c);
		tr.commit();
		session.close();
		return false;
	}

	@Override
	public boolean deleteCustomer(int custId) {
		session=DbConnection.getSession();
		tr=session.beginTransaction();
		Customer cc = session.get(Customer.class, custId);
		if(cc!=null)
		{
			session.delete(cc);
			
		}
		else
		return false;
		tr.commit();
		session.close();
		return true;
	}

	@Override
	public Customer getCustomer(int custId) {
		session=DbConnection.getSession();
		tr=session.beginTransaction();
		Customer customer = session.get(Customer.class, custId);
		tr.commit();
		session.close();
		
		return customer;
	}

	@Override
	public List<Customer> getAllCutomer() {
	
		session=DbConnection.getSession();
		tr=session.beginTransaction();
		Query<Customer> q = session.createQuery("from Customer");
		List<Customer> list2 = q.list();
		return list2;
	}

}
