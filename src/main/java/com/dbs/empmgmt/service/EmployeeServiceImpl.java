    
package com.dbs.empmgmt.service;

import com.dbs.empmgmt.dao.EmployeeDAO;
import com.dbs.empmgmt.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    public List<Employee> listAll() {
        return this.employeeDAO.findAll();
    }

    @Override
    public Employee findById(long empId)  {
        return this.employeeDAO.findById(empId);
    }

    @Override
    public void deleteEmployee(long empId) {
        this.employeeDAO.deleteEmployee(empId);
    }
}