package com.mmdworks.springcourse;

import java.util.List;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.mmdworks.springcourse.repo.Dao1;
import com.mmdworks.springcourse.service.Business1;
import com.mmdworks.springcourse.test.Address;
import com.mmdworks.springcourse.test.Employee;

@Configuration
@ImportResource({"classpath*:applicationContext.xml"})
public class SpringJavaConfiguration {
	
	
	@Bean
	public Employee getEmployeeBean() {
		Employee employee = new Employee();
		employee.seteName("Manideep");
		employee.seteSal("10");
		employee.setAddressList(getAddressList());
		return employee;
		
	}
	
	@Bean
	public List<Address> getAddressList() {
		List list= new ArrayList<>();
		Address address = new Address("Street1 ", "area1");
		list.add(address);
		return list;
	}
	
	@Bean
	public Business1 business1() {
		Business1 business1 = new Business1();
		business1.setDao1(dao1());
		return business1;
	}
	
	@Bean
	public Dao1  dao1() {
		return new Dao1();
	}
	
}
