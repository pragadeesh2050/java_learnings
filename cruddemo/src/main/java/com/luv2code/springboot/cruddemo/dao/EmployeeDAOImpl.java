package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {


    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        Session currentSession = this.entityManager.unwrap(Session.class);
        Query<Employee> employeeQuery = currentSession.createQuery("from Employee", Employee.class);
        return employeeQuery.getResultList();
    }

    @Override
    public Employee findOne(int employeeId){
        Session currentSession = this.entityManager.unwrap(Session.class);
        return currentSession.get(Employee.class, employeeId);
    }

    @Override
    public void save(Employee employee) {
        Session currentSession = this.entityManager.unwrap(Session.class);
        currentSession.save(employee);
    }

    @Override
    public void update(Employee employee) {
        Session currentSession = this.entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(employee);
    }

    @Override
    public void delete(int employeeId) {
        Session currentSession = this.entityManager.unwrap(Session.class);
        Query deleteQuery = currentSession.createQuery("delete from Employee where id=:employeeId");
        deleteQuery.setParameter("employeeId", employeeId);
        deleteQuery.executeUpdate();
    }
}
