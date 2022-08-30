package com.chainsys.sample.testclass;

//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

import com.chainsys.sample.model.Student;

public class ConsInjectionTest {

	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");
		
		Student student = (Student)context.getBean("stud");
		student.showStudDetails();;
		context.close();
		
//		Resource r=new ClassPathResource("applicationContent.xml");
//		BeanFactory factory=new XmlBeanFactory(r);
//		
//		Student student=(Student)factory.getBean("stud");
//		student.showStudDetails();;
	}
	
}
