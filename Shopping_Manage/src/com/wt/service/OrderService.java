package com.wt.service;

import java.util.List;

import com.wt.dao.OrderDao;
import com.wt.entity.Book;
import com.wt.entity.Order;
import com.wt.entity.Warehouse;

public class OrderService {
	
	private OrderDao orderDao;
	
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	
	// ���µĲ���Ϊ��ȡ�������
	public Book findBook(String bookname) {
		return orderDao.findBook(bookname);
	}
	
	// ���µĲ���Ϊ��ȡ�ֿ��е���
	public Warehouse findWarehouseBook(String bookname) {
		return orderDao.findWarehouseBook(bookname);
	}
	
	// ����Ϊ��ѯĳ���û��Ķ����б�
	public List<Order> findOrder(String userName) {
		return orderDao.findOrder(userName);
	}
	
	// ����Ϊ����µĶ���
	public void saveOrUpdateOrder(Order order){
		orderDao.saveOrUpdateOrder(order);
	}
	
	// ����Ϊ�û�����ͼ�飬��ͼ�鹺������������
	public void saveOrUpdateBook(Book book){
		orderDao.saveOrUpdateBook(book);
	}
	
	// ����Ϊ��ӻ���²ֿ��е�ͼ����Ϣ
	public void saveOrUpdateWarehouseBook(Warehouse warehouse){
		orderDao.saveOrUpdateWarehouseBook(warehouse);
	}

	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		orderDao.deleteBook(book);
	}

	public Book findBookById(Integer book_id) {
		// TODO Auto-generated method stub
		return orderDao.findBookById(book_id);
	}

	public void UpdateBook(Book book) {
		// TODO Auto-generated method stub
		orderDao.UpdateBook(book);
	}
	
}
