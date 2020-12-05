package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();
    public Employee findOne(int employeeId);
    public void save(Employee employee);
    public void update(Employee employee);
    public void delete(int employeeId);
}
