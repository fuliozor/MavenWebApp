package com.homework.controllers;

import com.homework.models.Department;
import com.homework.models.Employee;
import com.homework.services.DepartmentService;
import com.homework.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by dn261290kam on 22.01.14.
 */
@RequestMapping("/")
@Controller
public class SpringController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("departments", departmentService.getAllDepartments());
        return "departments/list";
    }

    @RequestMapping(value = "department/add", method = RequestMethod.GET)
    public String createDepartmentView(Model model) {

        return "departments/add";
    }

    @RequestMapping(value = "department/add", method = RequestMethod.POST)
    public String addDepartment(@RequestParam(value = "title", required = true) String departmentName,
                                Model model) {

        departmentService.createDepartment(departmentName);

        return "redirect:/";
    }

    @RequestMapping(value = "{department}/employee/add", method = RequestMethod.GET)
    public String createEmployeeView(@PathVariable String department, Model model) {

        model.addAttribute("department", department);
        return "employee/add";
    }

    @RequestMapping(value = "employee/add", method = RequestMethod.POST)
    public String addEmployee(@RequestParam(value = "department", required = true) String departmentId,
                              @RequestParam(value = "first", required = true) String firstName,
                              @RequestParam(value = "last", required = true) String lastName,
                                Model model) {

        Department department = departmentService.getDepartmentById(departmentId);

        if(department == null) {
            return "redirect:/";
        }

        employeeService.insertEmployee(firstName, lastName, department);

        //52e3e1862dba136a18734d9d/employees
        return "redirect:/" + department.getId() + "/employees";
    }

    @RequestMapping(value = "/{department}/employees", method = RequestMethod.GET)
    public String listEmployeesView(@PathVariable String department, Model model) {


        List<Employee> employees = employeeService.getEmployeeByDepartment(department);

        model.addAttribute("department", department);
        model.addAttribute("employees", employees);
        return "employee/list";
    }

}
