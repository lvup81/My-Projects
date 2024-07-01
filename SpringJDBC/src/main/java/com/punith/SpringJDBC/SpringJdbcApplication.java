package com.punith.SpringJDBC;

import com.punith.SpringJDBC.mode.Student;
import com.punith.SpringJDBC.servie.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringJdbcApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRoll(104);
		s.setName("Punith");
		s.setId(1);
		Service service = context.getBean(Service.class);
		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
