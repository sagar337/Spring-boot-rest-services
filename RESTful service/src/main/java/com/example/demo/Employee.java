package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String role;
	public Employee()
	{
		
	}
	public Employee(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
