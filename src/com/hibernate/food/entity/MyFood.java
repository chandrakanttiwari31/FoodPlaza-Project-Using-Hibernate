package com.hibernate.food.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyFood {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int foodId;
	private String foodName;
	private double foodPrice;
	private String foodDesc;
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodDesc() {
		return foodDesc;
	}
	public void setFoodDesc(String foodDesc) {
		this.foodDesc = foodDesc;
	}
	public MyFood() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyFood(int foodId, String foodName, double foodPrice, String foodDesc) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodDesc = foodDesc;
	}
	@Override
	public String toString() {
		return "MyFood [foodId=" + foodId + ", foodName=" + foodName + ", foodPrice=" + foodPrice + ", foodDesc="
				+ foodDesc + "]";
	}
	
	
	
	

}
