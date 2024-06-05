package com.sharathinfotech.Employee_info.Repository;

import com.sharathinfotech.Employee_info.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee,Integer> {
}
