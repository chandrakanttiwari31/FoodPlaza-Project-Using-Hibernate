package com.hibernate.food.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.book.utility.DbConnection;
import com.hibernate.food.dao.MyFoodDao;
import com.hibernate.food.entity.MyFood;
import com.mysql.cj.xdevapi.SessionFactory;

public class MyFoodDaoImpl implements MyFoodDao {

	Session session;
	Transaction tr = null;

	@Override
	public boolean addFood(MyFood food) {

		session = DbConnection.getSession();
		tr = session.beginTransaction();
		session.save(food);
		tr.commit();
		session.close();
		return false;
	}

	@Override
	public boolean updateFood(MyFood food) {
		session = DbConnection.getSession();
		tr = session.beginTransaction();
		session.update(food);
		tr.commit();
		session.close();
		return false;
	}

	@Override
	public boolean deleteFood(int foodId) {

		session = DbConnection.getSession();
		tr = session.beginTransaction();
		MyFood food = session.get(MyFood.class, foodId);

		if (food != null) {
			session.delete(food);

			
		} else {
			return false;
		}
		tr.commit();
		session.close();
		return true;
	}

	@Override
	public List<MyFood> getAllFood() {

		session = DbConnection.getSession();
		tr = session.beginTransaction();

		Query<MyFood> query = session.createQuery("from MyFood");
		List<MyFood> list = query.list();
		tr.commit();
		session.close();
		return list;
	}

	@Override
	public MyFood getFoodId(int foodId) {

		session = DbConnection.getSession();
		tr = session.beginTransaction();
		MyFood food = session.get(MyFood.class, foodId);
		tr.commit();
		session.close();
		return food;
	}

}
