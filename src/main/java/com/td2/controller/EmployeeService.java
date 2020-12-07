package com.td2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.td2.entities.Employee;
import com.td2.repositories.EmployeeRepository;


@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	//Create /update
	public void save(Employee employee) {
		repo.save(employee);
	}
	//Read
		public List<Employee> listAll() {
			return (List<Employee>) repo.findAll();
		}
	//find byID
	public Employee get(long id) {
		return repo.findById(id).get();
	}
	//delete ByID
	public void delete(long id) {
		repo.deleteById(id);
	}
}