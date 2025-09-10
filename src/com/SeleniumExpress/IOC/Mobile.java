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
		Sim sim1 = (Sim) context.getBean("airtel");
		useSim(sim1);
		Sim sim2 = context.getBean("jio", Jio.class);
		useSim(sim2);
		Sim sim3 = context.getBean("sim", Sim.class); //Dynamic sim Maybe jio or airtel depending on the IOC
		useSim(sim3);
	}

}
