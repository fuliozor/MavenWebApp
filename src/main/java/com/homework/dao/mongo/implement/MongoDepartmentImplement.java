package com.homework.dao.mongo.implement;

import com.homework.dao.DepartmentDAO;
import com.homework.models.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * Created by dn261290kam on 23.01.14.
 */
@Repository
public class MongoDepartmentImplement implements DepartmentDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Department> getAllDepartments() {
        return mongoTemplate.findAll(Department.class);
    }

    public void addDepartment(Department department) {
        mongoTemplate.save(department);
    }

    @Override
    public Department getDepartmentById(String id) {
        List<Department> list;
        list =  mongoTemplate.find(new Query(Criteria.where("_id").is(id)), Department.class);

        if(list.size() == 0) {
            return null;
        }

        return list.get(0);
    }
}
