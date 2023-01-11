package com.az.sa.bank.azbankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
//@EnableJpaRepositories("put repository path here")
@RestController
public class AzbankappApplication {

	@Autowired
	private EmployeeRepository repository;

	@PostMapping(path = "/employee")
	public Employee addEmployee(@RequestBody Employee transaction){
		return repository.save(transaction);
	}

	@GetMapping("/employees")
	public List<Employee> getAllTransaction()
	{
		return repository.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(AzbankappApplication.class, args);
	}

}
