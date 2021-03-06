package com.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Employee;

@Repository
public interface EmpRepo extends CrudRepository<Employee, Integer>{

}
