package com.example.sampledb.service;

import com.example.sampledb.domain.entity.Employee;
import com.example.sampledb.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repo;

    public Iterable<Employee> findAll() {
        return this.repo.findAll();
    }

    public Employee save(Employee employee) {
        return this.repo.save(employee);
    }

}
