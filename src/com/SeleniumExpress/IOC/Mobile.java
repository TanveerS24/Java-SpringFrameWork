package com.SeleniumExpress.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobile {
	
	private static void useSim(Sim sim) {
		sim.calling();
		sim.data();
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("loaded	");
		System.out.println(context.containsBean("airtel")? "True" : "False");
		Sim sim1 = (Sim) context.getBean("airtel");
		useSim(sim1);
		Sim sim2 = context.getBean("jio", Jio.class);
		useSim(sim2);
		context = null;
	}

}
