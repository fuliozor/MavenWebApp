package com.homework.dao.mongo.implement;

import com.homework.dao.EmployeeDAO;
import com.homework.models.Department;
import com.homework.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dn261290kam on 24.01.14.
 */
@Repository
public class MongoEmployeeImplment implements EmployeeDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {
        mongoTemplate.save(employee);
    }

    @Override
    public List<Employee> getEmployeesByDepartment(Department department) {
        return mongoTemplate.find(new Query(Criteria.where("department").is(department)), Employee.class);
    }
}
