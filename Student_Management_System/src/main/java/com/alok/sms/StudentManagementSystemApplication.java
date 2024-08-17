package com.alok.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alok.sms.entity.Student;
import com.alok.sms.repositary.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

		Student student1=new Student(0, "Ramesh", "Fadatare", "ramesh@gmail.com");
		studentRepository.save(student1);
		
		Student student2=new Student(1, "ubeukb", "Fadatqwhjvare", "ramesh@gmail.com");
		studentRepository.save(student2);
		
		Student student3=new Student(2, "hqehmesh", "qwv", "ramesh@gmail.com");
		studentRepository.save(student3);
		

	}

}
