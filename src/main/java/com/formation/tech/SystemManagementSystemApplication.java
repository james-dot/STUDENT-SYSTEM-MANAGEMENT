package com.formation.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.formation.tech.entity.Student;
import com.formation.tech.repository.StudentRepository;

@SpringBootApplication
public class SystemManagementSystemApplication implements CommandLineRunner{
	
	@Autowired
	private StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SystemManagementSystemApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		
//		Student std1= new Student("imad","el mernissi","imad.live1990@gmail.com");
//		studentRepository.save(std1);
//		Student std2= new Student("hassan","rami","imad.live1990@gmail.com");
//		studentRepository.save(std2);
//		Student std3= new Student("james","aloc","imad.live1990@gmail.com");
//		studentRepository.save(std3);
	}

}
