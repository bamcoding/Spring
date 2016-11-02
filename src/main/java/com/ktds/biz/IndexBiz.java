package com.ktds.biz;

import java.util.List;

import com.ktds.vo.DepartmentsVO;
import com.ktds.vo.EmployeesVO;

public interface IndexBiz {
	public String getNowDateTime();
	public List<EmployeesVO> getAllEmployees();
	public List<DepartmentsVO> getAllDepartments();
	public EmployeesVO getEmployeeByEmployeeId(String employeeId);
	public DepartmentsVO getDepartmentByDepartmentId(String departmentId);
	public boolean addNewEmployee(EmployeesVO employee);
	public boolean removeEmployee(String employeeId);
	public boolean addDepartment(DepartmentsVO departmentsVO);
	public boolean removeDepartment(String departmentId);
}
