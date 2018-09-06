package com.wt.service;

import java.util.List;

import org.hibernate.Query;

import com.wt.dao.EmployeeDao;
import com.wt.entity.Employee;

public class EmployeeService {

	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	
	// 管理员的登录验证
	public Employee employeeCheck(String employee_name, String employee_password) {
		
		return employeeDao.employeeCheck(employee_name, employee_password);
	}
	
}
