package com.hibernate.food.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.book.utility.DbConnection;
import com.hibernate.food.dao.CartDao;
import com.hibernate.food.entity.Cart;
import com.hibernate.food.entity.MyFood;

public class CartDaoImpl implements CartDao {

	
	Session session=null;
	Transaction tr=null;
	@Override
	public boolean addToCart(Cart cart) {
		
		
		int i=0;
		session=DbConnection.getSession();
		tr=session.beginTransaction();
		// for store the foodname and price in the database with the  helpof food ID
		
		MyFood myFood = session.get(MyFood.class, cart.getFoodId());
		
		if(myFood!=null)
		{
		cart.setFoodName(myFood.getFoodName());
		cart.setFoodPrice(myFood.getFoodPrice());
		
		
		 i = (int)session.save(cart);
		tr.commit();
		session.close();
		}
		if(i>0)
			return true;
		
		return false;
	}

	@Override
	public List<Cart> showCart(String custEmail) {
		return null;
	}

	@Override
	public boolean deleteCart(int cartId) {
		return false;
	}

	@Override
	public boolean updateCart(Cart cart) {
		return false;
	}

	@Override
	public List<Cart> showAllCarts() {
		// TODO Auto-generated method stub
		return null;
	}

}
