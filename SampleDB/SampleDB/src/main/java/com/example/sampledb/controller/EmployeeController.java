package com.example.sampledb.controller;

import com.example.sampledb.domain.entity.Employee;
import com.example.sampledb.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeRepository repo;

    @GetMapping("/employees")
    public Iterable<Employee> findAllEmployees() {
        return this.repo.findAll();
    }

    @PostMapping("/employees")
    public Employee addOneEmployee(@RequestBody Employee employee) {
        return this.repo.save(employee);
    }


}
