package com.ktds.biz.impl;

import java.util.List;

import com.ktds.biz.IndexBiz;
import com.ktds.dao.IndexDao;
import com.ktds.vo.DepartmentsVO;
import com.ktds.vo.EmployeesVO;

public class IndexBizImpl implements IndexBiz {
	private IndexDao indexDao;

	public void setIndexDao(IndexDao indexDao) {
		this.indexDao = indexDao;
	}

	@Override
	public String getNowDateTime() {
		return indexDao.getNowDateTime();
	}

	@Override
	public List<EmployeesVO> getAllEmployees() {
		// TODO Auto-generated method stub
		return indexDao.getAllEmployees();
	}

	@Override
	public List<DepartmentsVO> getAllDepartments() {
		// TODO Auto-generated method stub
		return indexDao.getAllDepartments();
	}

	@Override
	public EmployeesVO getEmployeeByEmployeeId(String employeeId) {
		// TODO Auto-generated method stub
		return indexDao.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public DepartmentsVO getDepartmentByDepartmentId(String departmentId) {
		// TODO Auto-generated method stub
		return indexDao.getDepartmentByDepartmentId(departmentId);
	}

	@Override
	public boolean addNewEmployee(EmployeesVO employee) {
		// TODO Auto-generated method stub
		return indexDao.addNewEmployee(employee) > 0;
	}
}
