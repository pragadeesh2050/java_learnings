package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
public class EmployeeSerivceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee findOne(int employeeId) {
        Optional<Employee> employeeOptional =this.employeeRepository.findById(employeeId);
        Employee employee = null;
        if(employeeOptional.isPresent()){
            employee = employeeOptional.get();
        }
        return employee;
    }

    @Override
    public void save(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public void update(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public void delete(int employeeId) {
        this.employeeRepository.deleteById(employeeId);
    }
}
