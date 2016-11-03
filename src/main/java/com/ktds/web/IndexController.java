package com.ktds.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ktds.service.IndexService;
import com.ktds.vo.DepartmentsVO;
import com.ktds.vo.EmployeesVO;

//Annotation
@Controller
public class IndexController {
	
	private IndexService indexService;
	
	public void setIndexService(IndexService indexService) {
		this.indexService = indexService;
	}
	
	// http://localhost:8080/HelloMVC/로 접속하면 실행됨.
	@RequestMapping("/")
	public String viewIndexPage(){
		return "index"; //jsp의 이름
	}
	
	@RequestMapping("/sub")
	public ModelAndView viewSubPage(){
		ModelAndView view = new ModelAndView("sub");//페이지를 지정하는 두번째 방법
		
		/*//페이지를 지정하는 첫번째 방법
		view.setViewName("sub");
		view.setViewName("main");*/
		
		// Servlet의 reqeust.setAttribute(k,v)와 같다. sddd
		view.addObject("key1","value1");
		view.addObject("key2","value2");
		view.addObject("key3","value3");
		view.addObject("key4","value4");
		
		return view;
	}
	@RequestMapping("/param")
	public ModelAndView viewParamPage(@RequestParam(required=false, defaultValue="") String param){
		System.out.println(param);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("param");
		view.addObject("param1", param);
		return view;	
	}
	
	@RequestMapping("/now")
	public ModelAndView viewNowDateTimePage(){
		
		String nowDateTime = indexService.getNowDateTime();
		System.out.println(nowDateTime);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("now");
		view.addObject("nowDateTime",nowDateTime);
		
		return view;
	}
	
	//employee
	
	@RequestMapping("/hr/employees")
	public ModelAndView viewAllEmpoyeesPage(){
		List<EmployeesVO> allEmployees = indexService.getAllEmployees();
		
		ModelAndView view = new ModelAndView();
		view.setViewName("hr/employees");
		view.addObject("allEmployees", allEmployees);
		return view;
	}
	@RequestMapping("/hr/employee/{employeeId}")
	public ModelAndView viewEmployeePage(@PathVariable String employeeId){
		
		EmployeesVO employee = indexService.getEmployeeByEmployeeId(employeeId);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("hr/employees");
		view.addObject("employee", employee);
		return view;
	}
	
	@RequestMapping("/hr/addNewEmployee")
	public String viewAddNewEmployeePage(){
		return "/hr/addNewEmployee";
	}
	
	@RequestMapping("/hr/doAddEmployeeAction")
	public ModelAndView doAddEmployeeAction(@Valid EmployeesVO employee, Errors errors){
		ModelAndView view =new ModelAndView();

		if(errors.hasErrors()){
			view.setViewName("/hr/addNewEmployee");
		}
		else{
			boolean isSuccess = indexService.addNewEmployee(employee);
			view.setViewName("redirect:/hr/employees");;
		}
		return view;
	}
	
	@RequestMapping("/hr/doRemoveEmployeeAction/{employeeId}")
	public ModelAndView doRemoveEmployeeAction(@PathVariable String employeeId){
		
		boolean isSuccess = indexService.removeEmployee(employeeId);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/hr/employees");
		return view;
	}
	
	
	
	//Department
	
	@RequestMapping("/hr/departments")
	public ModelAndView viewAllDepartmentsPage(){
		List<DepartmentsVO> allDepartments = indexService.getAllDepartments();
		
		ModelAndView view = new ModelAndView("hr/departments");
		view.addObject("allDepartments",allDepartments);
		return view;
	}
	
	
	@RequestMapping("/hr/department/{departmentId}")
	public ModelAndView viewDepartmentPage(@PathVariable String departmentId){
		
		DepartmentsVO department = indexService.getDepartmentByDepartmentId(departmentId);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("hr/departments");
		view.addObject("department",department);
		return view;
	}
	
	@RequestMapping("/hr/addNewDepartment")
	public String viewAddDepartmentPage(){
		return "hr/addNewDepartment";
	}
	
	@RequestMapping("/hr/doAddDepartmentAction")
	public ModelAndView doAddDepartmentAction(DepartmentsVO departmentsVO){
		boolean isSuccess = indexService.addDepartment(departmentsVO);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/hr/departments");
		return view;
	}
	
	@RequestMapping("/hr/doRemoveDepartment/{departmentId}")
	public ModelAndView doRemoveDepartment(@PathVariable String departmentId){
		
		boolean isSuccess = indexService.removeDepartment(departmentId);
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/hr/departments");
		return view;
	}

}
