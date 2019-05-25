package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

	private final EmployeeRepository repository;

	public EmployeeController(EmployeeRepository repository) {
		super();
		this.repository = repository;
	}
	
	@RequestMapping("/employees")
	List<Employee> getAllEmployee()
	{
		return repository.findAll();
	}
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee)
	{
		repository.save(employee);
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable String id)
	{
		Optional<Employee> topic =(repository.findById(id));
		Employee t = topic.get();
		return t;
	}
	
	@PutMapping("/employees/{id}")
	public void replaceEmployee(@RequestBody Employee newEmployee,@PathVariable String id)
	{
			repository.save(newEmployee);
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable String id)
	{
		repository.deleteById(id);
	}

}
	
