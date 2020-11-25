package com.hibernate.food.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    
	
	private int custId;
	private String custName;
	private String custAdd;
	private String custEmail;
	private String custPass;
	
	
	//for update
	public Customer(String custName, String custAdd, String custEmail, String custPass) {
		super();
		this.custName = custName;
		this.custAdd = custAdd;
		this.custEmail = custEmail;
		this.custPass = custPass;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//for add
	public Customer(int custId, String custName, String custAdd, String custEmail, String custPass) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAdd = custAdd;
		this.custEmail = custEmail;
		this.custPass = custPass;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAdd() {
		return custAdd;
	}
	public void setCustAdd(String custAdd) {
		this.custAdd = custAdd;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustPass() {
		return custPass;
	}
	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAdd=" + custAdd + ", custEmail="
				+ custEmail + ", custPass=" + custPass + "]";
	}
	
	
	
	
}
