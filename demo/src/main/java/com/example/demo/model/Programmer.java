package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {
	private int pid;
	private String pname;
	private String tech;


	@Autowired
	private Laptop lap;
	
	
	// Constructors
	public Programmer() {
		super();
		System.out.println("object created");
	}
	
	
	public Programmer(int pid, String pname, String tech, Laptop lap) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.tech = tech;
		this.lap = lap;
	}

	public Programmer(int pid, String pname, String tech) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.tech = tech;
	}


	// Getters and Setters
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public Laptop getLap() {
		return lap;
	}
	public void setLap(Laptop lap) {
		this.lap = lap;
	}
	

	
	@Override
	public String toString() {
		return "Programmer [pid=" + pid + ", pname=" + pname + ", tech=" + tech + ", lap=" + lap + "]";
	}
	
	
	public void show() {
		System.out.println("in show....");
		lap.run();
	}
	
}
