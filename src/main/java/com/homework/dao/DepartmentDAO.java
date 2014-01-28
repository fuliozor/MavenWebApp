package com.homework.dao;

import com.homework.models.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dn261290kam on 22.01.14.
 */
public interface DepartmentDAO {
    public List<Department> getAllDepartments();
    public void addDepartment(Department department);
    public Department getDepartmentById(String id);
}
