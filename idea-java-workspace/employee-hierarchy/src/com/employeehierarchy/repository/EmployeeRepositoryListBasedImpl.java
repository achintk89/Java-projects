package com.employeehierarchy.repository;

import com.employeehierarchy.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryListBasedImpl implements EmployeeRepository {


    List<Employee> employees;

    public EmployeeRepositoryListBasedImpl(){
        employees = new ArrayList<>();
    }

    public void saveEmployee(Employee employee) throws Exception {
        // write logic to validate employee
        // throw RuntimeException/Exception if
        // any of the rules aren't followed
        if (employee.getId() < 0 || employee.getSalary() < 0) {
           throw new Exception();
        }
        try
        {
            if(employee.getName().isEmpty() || employee.getEmail().isEmpty())
            {
                throw new NullPointerException();
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("Value can't be null or blank");
        }
        employees.add(employee);
    }


    public Employee findEmployee(int id) {
        return employees.stream().filter(e->e.getId()==id).findFirst().get();
    }


    public void deleteEmployee(int id) {
        Employee employee = findEmployee(id);
        employees.remove(employee);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
