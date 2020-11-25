package com.hibernate.food.test;

import java.util.Scanner;

import com.hibernate.food.dao.CartDao;
import com.hibernate.food.dao.impl.CartDaoImpl;
import com.hibernate.food.entity.Cart;

public class CartTest {

	public static void main(String[] args) {
		Cart cart = null;
		CartDao cdao = new CartDaoImpl();

		boolean result;
		int choice, ch;
		String custEmail;
		int foodId;
		int cQuantity;
		
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("=======Food Plaza In Hibernate========");
			System.out.println("1.Add  To Cart");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {

			case 1:
				System.out.println("-----------------Add To Cart----------");
				System.out.println("Enter Customer Email");
				custEmail=sc.next();
				System.out.println("Enter Food Id");
				foodId=sc.nextInt();
				System.out.println("Enter Cart Quantity");
				cQuantity=sc.nextInt();
				cart=new Cart(custEmail, foodId, cQuantity);
				result=cdao.addToCart(cart);
				if(result)
				{
					
					System.out.println("Food is Add in the Cart");
				}
				else
				{
					
					System.out.println("Food is not add ");
				}
				

				break;

			default:
				System.out.println("Invalid Choice");

			}
			System.out.println("Do You Eant To Continue...If Yes Enter Y....:");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
