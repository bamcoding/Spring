package com.ktds.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ktds.dao.IndexDao;
import com.ktds.vo.DepartmentsVO;
import com.ktds.vo.EmployeesVO;

public class IndexDaoImpl extends SqlSessionDaoSupport implements IndexDao{

	public String getNowDateTime(){
		
		return getSqlSession().selectOne("indexDao.getNowDateTime");
	}

	@Override
	public List<EmployeesVO> getAllEmployees() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("indexDao.getAllEmployees");
	}

	@Override
	public List<DepartmentsVO> getAllDepartments() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("indexDao.getAllDepartments");
	}

	@Override
	public EmployeesVO getEmployeeByEmployeeId(String employeeId) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("indexDao.getEmployeeByEmployeeId", employeeId);
	}

	@Override
	public DepartmentsVO getDepartmentByDepartmentId(String departmentId) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("indexDao.getDepartmentByDepartmentId", departmentId);
	}

	@Override
	public int addNewEmployee(EmployeesVO employee) {
		// TODO Auto-generated method stub
		return getSqlSession().insert("indexDao.addNewEmployee", employee);
	}

	@Override
	public int removeEmployee(String employeeId) {
		// TODO Auto-generated method stub
		return getSqlSession().delete("indexDao.removeEmployee", employeeId);
	}

	@Override
	public int addDepartment(DepartmentsVO departmentsVO) {
		// TODO Auto-generated method stub
		return getSqlSession().insert("indexDao.addDepartment", departmentsVO);
	}

	@Override
	public int removeDepartment(String departmentId) {
		// TODO Auto-generated method stub
		return getSqlSession().delete("indexDao.removeDepartment", departmentId);
	}
}
