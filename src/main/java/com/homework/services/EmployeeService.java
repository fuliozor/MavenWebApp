package com.homework.services;

import com.homework.dao.mongo.implement.MongoDepartmentImplement;
import com.homework.dao.mongo.implement.MongoEmployeeImplment;
import com.homework.models.Department;
import com.homework.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dn261290kam on 24.01.14.
 */
@Service
public class EmployeeService {

    @Autowired
    private MongoEmployeeImplment employeeDAO;
    @Autowired
    private MongoDepartmentImplement departmentDAO;

    public void insertEmployee(String firstName, String lastName, Department department) {
        Employee employee = new Employee();
        employee.setFirsName(firstName);
        employee.setLastName(lastName);
        employee.setDepartment(department);

        employeeDAO.addEmployee(employee);
    }

    public List<Employee> getEmployeeByDepartment(String departmentId) {
        Department department = departmentDAO.getDepartmentById(departmentId);

        if(department == null) {
            return null;
        }

        return employeeDAO.getEmployeesByDepartment(department);
    }
}
