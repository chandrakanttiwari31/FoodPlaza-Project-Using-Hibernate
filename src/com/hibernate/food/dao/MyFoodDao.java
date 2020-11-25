package com.hibernate.food.dao;

import java.util.List;

import com.hibernate.food.entity.MyFood;

public interface MyFoodDao {

	
	boolean addFood(MyFood food);
	boolean updateFood(MyFood food);
	boolean deleteFood(int foodId);
	List<MyFood> getAllFood();
	MyFood getFoodId(int foodId);
}
