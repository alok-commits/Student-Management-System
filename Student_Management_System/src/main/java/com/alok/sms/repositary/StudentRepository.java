package com.alok.sms.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alok.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
