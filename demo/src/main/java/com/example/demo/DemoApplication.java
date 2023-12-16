package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.ProgrammerController;
import com.example.demo.model.Laptop;
import com.example.demo.model.Programmer;
import com.example.demo.service.ProgrammerService;

@SpringBootApplication
public class DemoApplication {
	
	@Autowired
	Laptop l;
	@Autowired
	Programmer pr;
	@Autowired
	ProgrammerService service;
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);		
		
//		service.addProgrammer(new Programmer(25, "Naveen", "Java", new Laptop(1, "hp")));
//		service.addProgrammer(new Programmer(23, "Dheeraj", "Python", new Laptop(2, "hp")));
//		service.addProgrammer(new Programmer(24, "Sarayu", "Java", new Laptop(1, "Asus")));
//		service.addProgrammer(new Programmer(24, "Pragathi", "Java", new Laptop(3, "hp")));
//		service.addProgrammer(new Programmer(24, "Nikitha", "Java", new Laptop(1, "Dell")));
//		service.addProgrammer(new Programmer(26, "Preetham", "Java", new Laptop(1, "Lenovo")));
//		service.addProgrammer(new Programmer(34, "Srinivas", "SQL", new Laptop(2, "Lenovo")));
//		service.addProgrammer(new Programmer(25, "Soundarya", "GOLang", new Laptop(1, "Mac")));
//		service.addProgrammer(new Programmer(23, "Shresta", "Python", new Laptop(2, "Mac")));
//		service.addProgrammer(new Programmer(26, "Pavan", "Java", new Laptop(3, "Mac")));

//		Programmer programmer = new Programmer(25, "Naveen", "Java", l);
//		System.out.println(programmer.toString());
	
//		List<Programmer> programmers= service.getAllProgrammers();
//		
	}
	
	@Autowired
	public void createProgramController(ProgrammerController pgr) {
		pgr.createLaptop(l);
		System.out.println(l.toString());
		pgr.createProgrammer(pr);
		System.out.println(pr.toString());
		pgr.createList(service);
		System.out.println(service.toString());
	}
	
	@Autowired
	public void createProgramService(ProgrammerService pgrs) {
		pgrs.getEachProgrammer();
		System.out.println(pgrs.toString());
	}

	

}
