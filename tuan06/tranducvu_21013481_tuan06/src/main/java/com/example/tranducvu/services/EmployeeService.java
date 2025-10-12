package com.example.tranducvu.services;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
    public String getEmployeeInfo() {
        return "Employee: Nguyen Van A, Department: IT";
    }
}
