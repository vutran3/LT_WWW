package com.example.tranducvu;

import com.example.tranducvu.entities.Class;
import com.example.tranducvu.entities.Employee;
import com.example.tranducvu.entities.Person;
import com.example.tranducvu.entities.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Tranducvu21013481Tuan06Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("student", Student.class);
		Student student2 = context.getBean("student2", Student.class);
		Person person = context.getBean("person", Person.class);
		System.out.println(student);
		System.out.println(student2);
		System.out.println(person);

		Class class2 = context.getBean("class2", Class.class);
		System.out.println(class2);

		Employee employee1 = context.getBean("employee1", Employee.class);
		Employee employee2 = context.getBean("employee2", Employee.class);
		System.out.println(employee1);
		System.out.println(employee2);

		SpringApplication.run(Tranducvu21013481Tuan06Application.class, args);
	}

}
