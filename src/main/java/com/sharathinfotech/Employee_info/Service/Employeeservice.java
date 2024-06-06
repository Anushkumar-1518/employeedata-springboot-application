package com.sharathinfotech.Employee_info.Service;

import com.sharathinfotech.Employee_info.Model.Employee;
import com.sharathinfotech.Employee_info.Repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class Employeeservice {
    @Autowired
    private Employeerepository repo;
    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> getEmployee() {
        return repo.findAll();
    }

    public Optional<Employee> getEmployeeById(int id) {
        return repo.findById(id);
    }

    public String deleteEmployeeById(int id) {
        repo.deleteById(id);
        return " employee is Deleted";
    }
}
