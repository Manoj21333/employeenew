package com.Employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.Employee.Entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	Object alreadyExist = null;

}
