package com.wt.jsonHandle;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wt.entity.Employee;
import com.wt.service.EmployeeService;

public class EmployeeLoginJsonHandle extends ActionSupport{

	private static final long serialVersionUID = 1L;

	private Map<String, Object> dataMap;

	private Map<String, Object> session;
	
	private EmployeeService employeeService;
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	public String jsonEmployeeLogin(){
		
		dataMap = new HashMap<String, Object>();

		session = ActionContext.getContext().getSession();
		
		ActionContext context = ActionContext.getContext();
		
		HttpServletRequest request = (HttpServletRequest)context.get(ServletActionContext.HTTP_REQUEST);
		
		String adminName = request.getParameter("name");
		
		String adminPassword = request.getParameter("password");
		
		// 测试时使用
		System.out.println("adminName ---- " + adminName);
		System.out.println("adminPassword ---- " + adminPassword);
		
		Employee admin = employeeService.employeeCheck(adminName, adminPassword);
		
		if(admin == null){
			dataMap.put("data", "快递员名称或密码错误");
			dataMap.put("code", 1);
		}
		else{

			session.clear();
			
			// 向 session 中添加管理员名称
			session.put("employeeName", adminName);
			
			dataMap.put("data", admin);
			dataMap.put("code", 0);
		}
		
		return SUCCESS;
	}
	
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	
	
}
