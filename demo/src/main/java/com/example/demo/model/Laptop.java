package com.example.demo.model;


import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
	
	private int lid;
	private String brand;
	
	// getters and setters
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}



//	//constructor
//	public Laptop(int lid, String brand) {
//		super();
//		this.lid = lid;
//		this.brand = brand;
//	}
	
	
	public Laptop() {
		super();
		System.out.println("Laptop Object created");
	}
	
	public void run() {
		System.out.println("running in laptop.......");
	}


	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	

}
