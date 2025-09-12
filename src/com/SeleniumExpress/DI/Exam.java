package com.SeleniumExpress.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println(context.containsBean("student")?"yes":"no");
		Student student = context.getBean("student",Student.class);
		Student mithun = context.getBean("mithun",Student.class);
		student.displayInfo();
		Subject subject = context.getBean("subject", Subject.class);
		subject.subjectInfo();
		student.caughtCheating();
		mithun.caughtCheating();
	}

}
