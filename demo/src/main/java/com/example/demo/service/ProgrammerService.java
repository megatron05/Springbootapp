package com.example.demo.service;
import com.example.demo.model.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProgrammerService {
	
		
	List<Programmer> Programmers = new ArrayList<Programmer>();
	
	public void addProgrammer(Programmer p) {
		Programmers.add(p);
	}

	public List<Programmer> getAllProgrammers(){
		return Programmers;
	}
	
	public void getEachProgrammer() {
		for(Programmer pr : Programmers) {
			System.out.println(pr);
			}
	}
	
}
