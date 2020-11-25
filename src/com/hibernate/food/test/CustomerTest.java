package com.hibernate.food.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hibernate.food.dao.CustomerDao;
import com.hibernate.food.dao.impl.CustomerDaoImpl;
import com.hibernate.food.entity.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		int custId,choice,ch;
		String custEmail,custName,custPass,custAdd;
		Scanner sc=new Scanner(System.in);
		Customer c=new Customer();
		CustomerDao impl=new CustomerDaoImpl();
		List<Customer> list=new ArrayList<>();
		
		
		
		
		do {
			System.out.println("=======Food Plaza In Hibernate========");
			System.out.println("1.Add Customer");
			System.out.println("2.update  Customer");
			System.out.println("3.Delete Customer");
			System.out.println("4.Get All Customer");
			System.out.println("5. Get Customer By Id");
			
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			
			case 1:
				System.out.println("Add Customer Operation");
				System.out.println("Enter Customer Name");
				c.setCustName(sc.nextLine());
				System.out.println("Enter Customer Address");
				c.setCustAdd(sc.nextLine());
				System.out.println("Enter Customer Email");
				c.setCustEmail(sc.nextLine());
				System.out.println("Enter Customer Password");
				c.setCustPass(sc.nextLine());
				
				impl.addCustomer(c);
				System.out.println("Customer Added");
				
				break;
			case 2:
				System.out.println("Update Operation");
				
				System.out.println("Enter Cust Id Which You Wantto Update");
				custId=sc.nextInt();
				sc.nextLine();
				c=impl.getCustomer(custId);
				if(c!=null)
				{
					
					System.out.println("Enter Customer Name");
					c.setCustName(sc.nextLine());
					System.out.println("Enter Customer Address");
					c.setCustAdd(sc.nextLine());
					System.out.println("Enter Customer Email");
					c.setCustEmail(sc.nextLine());
					System.out.println("Enter Customer Password");
					c.setCustPass(sc.nextLine());
                    impl.updateCustomer(c);
                    System.out.println("Update successfull");
                    
                    System.out.println("Here the Update Customer is :-");
                    list = impl.getAllCutomer();
                    list.forEach((all)->{System.out.println(all);});
					
				}
				else
					System.out.println("customer not found");
				
				
				break;
			case 3:
				
				System.out.println("Delete Customer");
				System.out.println("Enter Customer ID");
				custId=sc.nextInt();
				
				boolean r = impl.deleteCustomer(custId);
				
				if(r) {
					
					System.out.println("Deleted");
				}
				else
					System.out.println("not deleted");
				
				break;
			case 4:
				System.out.println("Get Customer List");
				list = impl.getAllCutomer();
				
				
				//1st method
				//list.forEach((all)->{System.out.println(all);});
				
				//2nd method
				
				Iterator<Customer> itr = list.iterator();
				while(itr.hasNext())
				{
					c=itr.next();
					System.out.println(c);
				}
				break;
			case 5:
				System.out.println("Get single Customer");
				System.out.println("Enter Customer id");
				custId=sc.nextInt();
				Customer customer = impl.getCustomer(custId);
				if(customer!=null)
				{
					System.out.println("Here the customer record");
				System.out.println(customer);
				}
				else
					System.out.println("not found please Enter the valid Customer id");
				
				break;
		default:
			System.out.println("Invalid Choice");
	
	}
	System.out.println("Do You Eant To Continue...If Yes Enter Y....:");
	ch = sc.next().charAt(0);
} while (ch == 'y' || ch == 'Y');
		
	}
	

}
