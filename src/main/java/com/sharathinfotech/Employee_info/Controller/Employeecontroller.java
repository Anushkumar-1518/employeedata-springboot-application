package com.sharathinfotech.Employee_info.Controller;

import com.sharathinfotech.Employee_info.Model.Employee;
import com.sharathinfotech.Employee_info.Service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class Employeecontroller {
    @Autowired
    private Employeeservice service;

    @PostMapping("/addemp")
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    }
    @GetMapping
    public List<Employee> getEmployee(){
        return (List<Employee>) service.getEmployee();
    }
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        return service.deleteEmployeeById(id);
    }

}


