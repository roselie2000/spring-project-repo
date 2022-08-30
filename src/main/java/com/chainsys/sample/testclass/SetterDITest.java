package com.chainsys.sample.testclass;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chainsys.sample.model.Employee;
//import com.chainsys.sample.model.Student;

public class SetterDITest {

	public static void main(String[] args) {
AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = (Employee)context.getBean("emp");
		emp.showDetails();;
		context.close();

	}
}
