package com.td2.repositories;

import org.springframework.data.repository.CrudRepository;

import com.td2.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
