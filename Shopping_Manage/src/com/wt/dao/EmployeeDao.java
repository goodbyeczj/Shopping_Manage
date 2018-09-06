package com.wt.dao;

import java.util.List;

import org.hibernate.Query;

import com.wt.entity.Employee;
import com.wt.entity.User;

public class EmployeeDao extends BaseDao{

	// ��ѯ���еĹ���Ա
	public List<Employee> getAll(){
	
		String hql = "FROM Employee";
		
		return getSession().createQuery(hql).list();
		
	}
	
	// �û��ĵ�¼��֤
	public Employee employeeCheck(String employee_name, String employee_password) {
		
		Employee employee = null;
		
		String hql = "FROM Employee a WHERE a.name = ? and a.password = ?";
		
		Query query = getSession().createQuery(hql);
		
		query.setString(0, employee_name);
		query.setString(1, employee_password);
		
		employee = (Employee) query.uniqueResult();
		
		return employee;
	}
	
}
