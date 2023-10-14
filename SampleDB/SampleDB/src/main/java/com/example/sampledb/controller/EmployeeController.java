package com.example.sampledb.controller;

import com.example.sampledb.domain.entity.Employee;
import com.example.sampledb.repository.EmployeeRepository;
import com.example.sampledb.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    @GetMapping("/employees")
    public Iterable<Employee> findAllEmployees() {
        return this.service.findAll();
    }

    @PostMapping("/employees")
    public Employee addOneEmployee(@RequestBody Employee employee) {
        return this.service.save(employee);
    }

}
