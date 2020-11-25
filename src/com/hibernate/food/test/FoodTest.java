package com.hibernate.food.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import com.hibernate.food.dao.impl.MyFoodDaoImpl;
import com.hibernate.food.entity.MyFood;

public class FoodTest {

	public static void main(String[] args) {
		boolean result;
		int choice,foodId;
		double foodPrice;
		String foodName,foodDesc;
		int ch;
		MyFood food=new MyFood();
		MyFoodDaoImpl impl=new MyFoodDaoImpl();
		Scanner sc=new Scanner(System.in);
		List<MyFood> list=new ArrayList<>();
		
		do {
		System.out.println("=======Food Plaza In Hibernate========");
		System.out.println("1.Add Food");
		System.out.println("2.update  Food");
		System.out.println("3.Delete Food");
		System.out.println("4.Get All Food");
		System.out.println("5. Get Food By Id");
		
		System.out.println("Enter Your Choice");
		choice=sc.nextInt();
		sc.nextLine();
		
		switch(choice)
		{
		case 1:
			System.out.println("This Is Our Add Food Operation");
			System.out.println("Enter Food Name");
			food.setFoodName(sc.nextLine());
			System.out.println("Enter Food Price");
			food.setFoodPrice(sc.nextDouble());
			sc.nextLine();
			System.out.println("Enter Food Description");
			food.setFoodDesc(sc.nextLine());
			 impl.addFood(food);
			 System.out.println("Food Added");
			
			
			
			break;
			
		case 2:
			
			System.out.println("This Is Our Update Food Operation");
			System.out.println("Enter Food Id Which You Want to Update");
			foodId=sc.nextInt();
			sc.nextLine();
			
		     food = impl.getFoodId(foodId);
		     if(food !=null)
		     {
			System.out.println("Enter Food Name");
			food.setFoodName(sc.nextLine());
			System.out.println("Enter Food Price");
			food.setFoodPrice(sc.nextDouble());
			sc.nextLine();
			System.out.println("Enter Food Description");
			food.setFoodDesc(sc.nextLine());
			 impl.updateFood(food);
			 System.out.println("Food update");
			 
			 System.out.println("Updated Food List is:-");
			 list=impl.getAllFood();
//			list.forEach(new Consumer<MyFood>() {
//
//				@Override
//				public void accept(MyFood t) {
//					// TODO Auto-generated method stub
//					
//				}
//			});
			 
			 list.forEach((all)->{System.out.println(all);});
			 
		     }
		     else
		     {
		    	 
		    	 System.out.println("food not foung  enter the valid food id");
		     }
			
			break;
		
		case 3:
			
			System.out.println("Delete Operation");
			System.out.println("Enter Food Id");
			foodId=sc.nextInt();
			boolean rr = impl.deleteFood(foodId);
			if(rr)
			{
				System.out.println("Food is Deleted");
				
			}
			else
			{
				
				System.out.println("Not Deleted.....");
			}
			break;
			
		case 4:
			System.out.println(" Get All Food");
	list = impl.getAllFood();
	Iterator<MyFood> itr = list.iterator();
			while(itr.hasNext())
			{
				food=itr.next();
				System.out.println(food);
				
			}
			break;
			
		case 5:
			System.out.println("Get Food By Id");
			System.out.println("Enter Food Id");
			foodId=sc.nextInt();
			food=impl.getFoodId(foodId);
			
			if(food !=null)
			{
				System.out.println("Here Your Food");
				System.out.println(food);
				
			}
			else
				
				System.out.println("food Not Found");
			
			break;
			
			default:
				System.out.println("Invalid Choice");
		
		}
		System.out.println("Do You Eant To Continue...If Yes Enter Y....:");
		ch = sc.next().charAt(0);
	} while (ch == 'y' || ch == 'Y');
	}

}
