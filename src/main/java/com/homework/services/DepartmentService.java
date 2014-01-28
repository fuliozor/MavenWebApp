package com.homework.services;

import com.homework.dao.DepartmentDAO;
import com.homework.dao.mongo.implement.MongoDepartmentImplement;
import com.homework.dao.mysql.implement.MySQLDepartmentImpl;
import com.homework.models.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dn261290kam on 22.01.14.
 */
@Service
public class DepartmentService {

    /*@Autowired
    private MySQLDepartmentImpl departmentDAO;*/

    @Autowired
    private MongoDepartmentImplement departmentDAO;

    public List<Department> getAllDepartments() {
        return departmentDAO.getAllDepartments();
    }

    public void createDepartment(String name) {
        Department department = new Department();
        department.setName(name);
        departmentDAO.addDepartment(department);
    }

    public Department getDepartmentById(String id) {
        return departmentDAO.getDepartmentById(id);
    }
}
