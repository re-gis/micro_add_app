package com.example.micro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.micro.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}