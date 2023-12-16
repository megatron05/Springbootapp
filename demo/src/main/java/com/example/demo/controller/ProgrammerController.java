package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Laptop;
import com.example.demo.model.Programmer;
import com.example.demo.service.ProgrammerService;


@Component
public class ProgrammerController {

	@Autowired
	Programmer pr;
	Laptop l;
	ProgrammerService service;
	
	
	
	public ProgrammerController() {
		super();
		System.out.println("PC object created");
	}

	public Laptop createLaptop(Laptop l) {
		this.l = l;
		l.setLid(1);
		l.setBrand("hp");
		return l;
	}
	
	public Programmer createProgrammer(Programmer pr) {
		this.pr = pr;
		pr.setPid(25); 
		pr.setPname("Naveen");
		pr.setTech("Java");
		pr.setLap(l);
		return pr;
	}
	
	public void createList(ProgrammerService service) {
		this.service = service;
		service.addProgrammer(pr);
	}
	
	
}

