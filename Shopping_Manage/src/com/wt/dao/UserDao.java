package com.wt.dao;

import java.util.List;

import org.hibernate.Query;

import com.wt.entity.User;

public class UserDao extends BaseDao{

	// ��ѯ���е��û�
	public List<User> getAll(){
	
		String hql = "FROM User";
		
		return getSession().createQuery(hql).list();
		
	}
	
	// �û��ĵ�¼��֤
	public User userCheck(String username, String password) {
		
		User user = null;
		
		String hql = "FROM User u WHERE u.user_name = ? and u.user_password = ?";
		
		Query query = getSession().createQuery(hql);
		
		query.setString(0, username);
		query.setString(1, password);
		
		user = (User) query.uniqueResult();
		
		return user;
	}
	
	// �û�ע�ᣬ�����ݿ��в�������;
	// �û��޸���Ϣ��������ͬ�ķ���
	public void saveOrUpdate(User user){
		
		getSession().saveOrUpdate(user);
		
	}
	
	// �������֤
	public User emailCheck(String email){
		User user = null;
		
		String hql = "FROM User u WHERE u.user_email = ?";
		
		Query query = getSession().createQuery(hql);
		
		query.setString(0, email);
		
		user = (User) query.uniqueResult();
		
		return user;
	}
	
	// �û����Ƿ�ע��ļ���
	public User usernameCheck(String username){
		User user = null;
		
		String hql = "FROM User u WHERE u.user_name = ?";
		
		Query query = getSession().createQuery(hql);
		
		query.setString(0, username);
		
		user = (User) query.uniqueResult();
		
		return user;
	}
	
	// ɾ���û�
	public void delete(Integer id){
		
		String hql = "DELETE FROM User u WHERE u.id = ?";
		
		getSession().createQuery(hql).setInteger(0, id).executeUpdate();
		
	}
	/**
	 * @author darkness
	 * @param	user
	 */
	public void update(User user) {
		getSession().update(user);
	}
	/**
	 * @author darkness
	 * @param id
	 * @since 2018/7/11
	 * @return User
	 */
	public User findUserById(int id) {
		return (User)getSession().get(User.class, id);
	}
}
