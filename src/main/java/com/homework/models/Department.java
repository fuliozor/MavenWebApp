package com.homework.models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Set;

//@Entity
@Document(collection = "departments")
public class Department {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
