package com.homework.dao;

import com.homework.models.Department;
import com.homework.models.Employee;

import java.util.List;

/**
 * Created by dn261290kam on 24.01.14.
 */
public interface EmployeeDAO {

    public List<Employee> getAllEmployees();
    public void addEmployee(Employee employee);
    public List<Employee> getEmployeesByDepartment(Department department);
}
