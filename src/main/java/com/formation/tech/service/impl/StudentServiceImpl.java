package com.formation.tech.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.formation.tech.entity.Student;
import com.formation.tech.repository.StudentRepository;
import com.formation.tech.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

}
