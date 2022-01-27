package com.formation.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.tech.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
