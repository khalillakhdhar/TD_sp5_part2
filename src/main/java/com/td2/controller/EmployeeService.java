package com.td2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.td2.repositories.EmployeeRepository;


@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	//Create /update
	public void save(User user) {
		repo.save(user);
	}
	//Read
		public List<User> listAll() {
			return repo.findAll();
		}
	//find byID
	public User get(long id) {
		return repo.findById(id).get();
	}
	//delete ByID
	public void delete(long id) {
		repo.deleteById(id);
	}
}