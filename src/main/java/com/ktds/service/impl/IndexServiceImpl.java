package com.ktds.service.impl;

import java.util.List;

import com.ktds.biz.IndexBiz;
import com.ktds.service.IndexService;
import com.ktds.vo.DepartmentsVO;
import com.ktds.vo.EmployeesVO;

public class IndexServiceImpl implements IndexService{

	private IndexBiz indexBiz;

	public void setIndexBiz(IndexBiz indexBiz) {
		this.indexBiz = indexBiz;
	}

	@Override
	public String getNowDateTime() {
		return indexBiz.getNowDateTime();
	}

	@Override
	public List<EmployeesVO> getAllEmployees() {
		// TODO Auto-generated method stub
		return indexBiz.getAllEmployees();
	}

	@Override
	public List<DepartmentsVO> getAllDepartments() {
		// TODO Auto-generated method stub
		return indexBiz.getAllDepartments();
	}

	@Override
	public EmployeesVO getEmployeeByEmployeeId(String employeeId) {
		// TODO Auto-generated method stub
		return indexBiz.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public DepartmentsVO getDepartmentByDepartmentId(String departmentId) {
		// TODO Auto-generated method stub
		return indexBiz.getDepartmentByDepartmentId(departmentId);
	}

	@Override
	public boolean addNewEmployee(EmployeesVO employee) {
		// TODO Auto-generated method stub
		return indexBiz.addNewEmployee(employee);
	}

	@Override
	public boolean removeEmployee(String employeeId) {
		// TODO Auto-generated method stub
		return indexBiz.removeEmployee(employeeId);
	}

	@Override
	public boolean addDepartment(DepartmentsVO departmentsVO) {
		// TODO Auto-generated method stub
		return indexBiz.addDepartment(departmentsVO);
	}

	@Override
	public boolean removeDepartment(String departmentId) {
		// TODO Auto-generated method stub
		return indexBiz.removeDepartment(departmentId);
	}
	
}
