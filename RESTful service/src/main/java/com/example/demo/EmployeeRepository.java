package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,String>{

	//public Employee getEmployeeById(Long id);

}
