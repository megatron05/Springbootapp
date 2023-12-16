package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
	public void run() {
		System.out.println("running in laptop.......");
	}
}
