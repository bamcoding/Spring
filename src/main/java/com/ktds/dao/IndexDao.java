package com.ktds.dao;

import java.util.List;

import com.ktds.vo.DepartmentsVO;
import com.ktds.vo.EmployeesVO;

public interface IndexDao {
	public String getNowDateTime();

	public List<EmployeesVO> getAllEmployees();

	public List<DepartmentsVO> getAllDepartments();

	public EmployeesVO getEmployeeByEmployeeId(String employeeId);

	public DepartmentsVO getDepartmentByDepartmentId(String departmentId);

	public int addNewEmployee(EmployeesVO employee);

	public int removeEmployee(String employeeId);

	public int addDepartment(DepartmentsVO departmentsVO);

	public int removeDepartment(String departmentId);
}
