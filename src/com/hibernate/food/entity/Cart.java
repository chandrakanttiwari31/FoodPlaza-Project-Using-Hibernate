package com.hibernate.food.entity;

public class Cart {

	private int cartId;
	private String custEmail;
	private int foodId;
	private int cQuantity;
	private String foodName;
	private double foodPrice;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//insert 
	public Cart(String custEmail, int foodId, int cQuantity) {
		super();
		this.custEmail = custEmail;
		this.foodId = foodId;
		this.cQuantity = cQuantity;
	}

	public Cart(int cartId, int cQuantity) {
		super();
		this.cartId = cartId;
		this.cQuantity = cQuantity;
	}

	
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public int getCartQuantity() {
		return cQuantity;
	}

	public void setCartQuantity(int cartQuantity) {
		this.cQuantity = cartQuantity;
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

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", custEmail=" + custEmail + ", foodId=" + foodId + ", cQuantity=" + cQuantity
				+ ", foodName=" + foodName + ", foodPrice=" + foodPrice + "]";
	}
	
	//update or change cart quantity
	
	
	
}
