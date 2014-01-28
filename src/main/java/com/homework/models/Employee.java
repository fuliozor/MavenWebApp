package com.homework.models;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Date;

//@Entity
@Document(collection = "employee")
public class Employee {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String id;
    private String firsName;
    private String lastName;
    private Date birthday;
    //@ManyToOne
    @DBRef
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    /**
     * Возвращает строку в JSON
     * @param type
     * @return
     * <b style="color:red">!!!Так делать не стоит</b>
     */
    public String toString(String type) {
        return "{" +
                "'id='" + id +
                ", 'firsName'='" + firsName + '\'' +
                ", 'lastName'='" + lastName + '\'' +
                ", 'birthday'='" + birthday + '\'' +
                '}';
    }
}
