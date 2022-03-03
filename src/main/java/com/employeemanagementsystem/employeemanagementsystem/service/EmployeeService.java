package com.employeemanagementsystem.employeemanagementsystem.service;

import com.employeemanagementsystem.employeemanagementsystem.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeBdyId(long id);

    void deleteEmployeeById(long id);

    default Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        return null;
    }

}
