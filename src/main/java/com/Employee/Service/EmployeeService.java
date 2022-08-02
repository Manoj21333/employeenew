package com.Employee.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Entity.Employee;
import com.Employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	 EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee(){
		
		List<Employee> employee = new ArrayList<Employee>();  
		employeeRepository.findAll().forEach(employee1 -> employee.add(employee1));  
		employee.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
		
		return employee;
	}
	
	public Employee getEmployeeById(int id)   
	{  
	return employeeRepository.findById(id).get();  
	}  
	
	public void saveOrUpdate(Employee employee) 

	{ 
	
		employeeRepository.save(employee);  
		
	}  
	public void delete(int id)   
	{  
		employeeRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Employee employee, int id)   
	{  
		employeeRepository.save(employee);  
	}

	public boolean existsById(int id) {
		// TODO Auto-generated method stub
		return false;
	}  
}
