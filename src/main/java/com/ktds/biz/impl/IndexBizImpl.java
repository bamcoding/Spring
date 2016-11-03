package com.ktds.biz.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ktds.biz.IndexBiz;
import com.ktds.dao.IndexDao;
import com.ktds.vo.DepartmentsVO;
import com.ktds.vo.EmployeesVO;

public class IndexBizImpl implements IndexBiz {
	private IndexDao indexDao;

	private Logger logger = LoggerFactory.getLogger(IndexBizImpl.class);
	
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

	@Override
	public boolean removeEmployee(String employeeId) {
		// TODO Auto-generated method stub
		boolean isSuccess =  indexDao.removeEmployee(employeeId)>0;
		logger.debug("삭제가 재데로 동작했는가 :"+isSuccess);
		return isSuccess;
	}

	public boolean addDepartment(DepartmentsVO departmentsVO) {
		// TODO Auto-generated method stub
		return indexDao.addDepartment(departmentsVO)>0;
	}

	@Override
	public boolean removeDepartment(String departmentId) {
		// TODO Auto-generated method stub
		return indexDao.removeDepartment(departmentId)>0;
	}
}
