package com.qa.gateway.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.gateway.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
