package com.luv2code.springboot.cruddemo.respository;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
