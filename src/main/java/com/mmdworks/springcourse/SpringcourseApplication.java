package com.mmdworks.springcourse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mmdworks.springcourse.service.Business1;
import com.mmdworks.springcourse.service.Business2;
import com.mmdworks.springcourse.test.Employee;

@SpringBootApplication
public class SpringcourseApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(SpringcourseApplication.class);
	
	
	@Autowired
	private Business2 business2;
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringcourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfiguration.class);
		
		Employee employee1= (Employee) context.getBean("employeeXmlBean");
		Employee employee = (Employee) context.getBean("getEmployeeBean");
		System.out.println(employee.toString());
		System.out.println(employee1.toString());
		
		Business1 business1 = (Business1) context.getBean("business1");
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
		
		
	}
}
