package com.homework.dao.mysql.implement;

import com.homework.dao.DepartmentDAO;
import com.homework.models.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dn261290kam on 22.01.14.
 */
@Repository
public class MySQLDepartmentImpl implements DepartmentDAO {

    @Autowired
    HibernateTemplate hibernateTemplate;

    @Override
    public List<Department> getAllDepartments() {
        return hibernateTemplate.find("from Department");
    }

    @Override
    public void addDepartment(Department department) {

    }

    @Override
    public Department getDepartmentById(String id) {
        return null;
    }

    public void save (Department department){
        hibernateTemplate.save(department);
    }
}
