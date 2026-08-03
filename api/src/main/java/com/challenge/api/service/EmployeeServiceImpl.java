package com.challenge.api.service;

import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeCreate;
import com.challenge.api.model.EmployeeModel;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private List<Employee> employees;

    public EmployeeServiceImpl() {
        employees = new ArrayList<>();

        EmployeeModel employee1 = new EmployeeModel();
        employee1.setUuid(UUID.randomUUID());
        employee1.setFirstName("John");
        employee1.setLastName("Stafford");
        employee1.setFullName("John Stafford");
        employee1.setJobTitle("Database engineer");
        employee1.setSalary(90000);
        employee1.setAge(40);
        employee1.setEmail("js0032@company.com");
        employee1.setContractHireDate(Instant.now());
        employees.add(employee1);

        EmployeeModel employee2 = new EmployeeModel();
        employee2.setUuid(UUID.randomUUID());
        employee2.setFirstName("Bertram");
        employee2.setLastName("Gilfoyle");
        employee2.setFullName("Bertram Gilfoyle");
        employee2.setJobTitle("CSO");
        employee2.setSalary(250000);
        employee2.setAge(29);
        employee2.setEmail("bg2233@company.com");
        employee2.setContractHireDate(Instant.now());
        employees.add(employee2);
    }

    @Override // optional
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeByUuid(UUID uuid) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getUuid().equals(uuid)) {
                return employees.get(i);
            }
        }
        return null;
    }

    @Override
    public Employee createEmployee(EmployeeCreate input) {

        EmployeeModel employee = new EmployeeModel();
        employee.setUuid(UUID.randomUUID());
        employee.setFirstName(input.getFirstName());
        employee.setLastName(input.getLastName());
        employee.setFullName(input.getFirstName() + " " + input.getLastName());
        employee.setJobTitle(input.getJobTitle());
        employee.setSalary(input.getSalary());
        employee.setAge(input.getAge());
        employee.setEmail(input.getEmail());
        employee.setContractHireDate(input.getContractHireDate());
        employees.add(employee);
        return employee;
    }
}
