package com.hibernate.food.dao;

import java.util.List;

import com.hibernate.food.entity.Cart;

public interface CartDao {

	boolean addToCart(Cart cart);
	List<Cart> showCart(String custEmail);
	boolean deleteCart(int cartId);
	boolean updateCart(Cart cart);
	List<Cart> showAllCarts();
}
