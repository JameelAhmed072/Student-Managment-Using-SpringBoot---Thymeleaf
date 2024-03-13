package com.main.studentManagement;

import com.main.studentManagement.entity.Student;
import com.main.studentManagement.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	StudentRepo studentRepo;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student(1L,"Jameel", "Ahmed", "jameel@gmail.com");
//		Student student2 = new Student(2L,"Toqeer", "Ahmed", "toqeer@gmail.com");
//		Student student5 = new Student(5L,"Mudasir", "Ahmed", "mudasir@gmail.com");
//		Student student6 = new Student(6L,"Saad", "Ahmed", "saad@gmail.com");
//		Student student3 = new Student(3L,"Aziz", "Ahmed", "aziz@gmail.com");
//		Student student4 = new Student(4L,"Waqar", "Ahmed", "waqar@gmail.com");
//		studentRepo.save(student1);
//		studentRepo.save(student2);
//		studentRepo.save(student3);
//		studentRepo.save(student4);
//		studentRepo.save(student5);
//		studentRepo.save(student6);
	}
}
