package com.luv2code.springboot.cruddemo.rest;


import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> index(){
        return this.employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee get(@PathVariable("employeeId") int employeeId){
        return this.employeeService.findOne(employeeId);
    }

    @PostMapping("/employees")
    public Employee create(@RequestBody Employee employee){
        employee.setId(0);
        this.employeeService.save(employee);
        return employee;
    }

    @PatchMapping("/employees")
    public Employee update(@RequestBody Employee employee){
        this.employeeService.update(employee);
        return employee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public void delete(@PathVariable int employeeId){
        this.employeeService.delete(employeeId);
    }
}
