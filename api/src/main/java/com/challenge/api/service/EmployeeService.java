package com.challenge.api.service;

import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeCreate;
import java.util.List;
import java.util.UUID;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployeeByUuid(UUID uuid);

    Employee createEmployee(EmployeeCreate input);
}
