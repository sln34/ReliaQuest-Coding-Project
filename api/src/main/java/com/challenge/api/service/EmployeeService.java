package com.challenge.api.service;

import java.util.List;
import java.util.UUID;
import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeCreate;

public interface EmployeeService {

     List<Employee> getAllEmployees();

     Employee getEmployeeByUuid(UUID uuid);

     Employee createEmployee(EmployeeCreate input);
}