package com.wt.dao;

import java.util.List;

import org.hibernate.Query;

import com.wt.entity.Book;
import com.wt.entity.Order;
import com.wt.entity.Warehouse;

public class OrderDao extends BaseDao{
	
	// ���µĲ���Ϊ��ȡ�������
	public Book findBook(String bookname) {
		Book book = null;
		
		String hql = "FROM Book b LEFT OUTER JOIN FETCH b.orders WHERE b.book_name = ?";
		
		Query query = getSession().createQuery(hql);
		
		query.setString(0, bookname);
		
		book = (Book) query.uniqueResult();
		
		return book;
	}
	
	// ���µĲ���Ϊ��ȡ�ֿ��е���
	public Warehouse findWarehouseBook(String bookname) {
		Warehouse warehouse = null;
		
		String hql = "FROM Warehouse w WHERE w.book_name = ?";
		
		Query query = getSession().createQuery(hql);
		
		query.setString(0, bookname);
		
		warehouse = (Warehouse) query.uniqueResult();
		
		return warehouse;
	}
	
	// ����Ϊ��ѯĳ���û��Ķ����б�
	@SuppressWarnings("unchecked")
	public List<Order> findOrder(String userName) {
		List<Order> orders = null;
		
		String hql = "FROM Order o LEFT OUTER JOIN FETCH o.book WHERE o.user_name = ?";
		
		Query query = getSession().createQuery(hql);

		orders = query.setString(0, userName).list();
		
		return orders;
	}
	
	// ����Ϊ����µĶ���
	public void saveOrUpdateOrder(Order order){
		getSession().saveOrUpdate(order);
	}
	
	// ����Ϊ�û�����ͼ�飬��ͼ�鹺������������
	public void saveOrUpdateBook(Book book){
		getSession().saveOrUpdate(book);
	}
	
	// ����Ϊ��ӻ���²ֿ��е�ͼ����Ϣ
	public void saveOrUpdateWarehouseBook(Warehouse warehouse){
		getSession().saveOrUpdate(warehouse);
	}

	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		getSession().delete(book);
	}

	public Book findBookById(Integer book_id) {
		// TODO Auto-generated method stub
		return (Book)getSession().get(Book.class, book_id);
	}

	public void UpdateBook(Book book) {
		// TODO Auto-generated method stub
		getSession().update(book);
	}
	
	
	
}
