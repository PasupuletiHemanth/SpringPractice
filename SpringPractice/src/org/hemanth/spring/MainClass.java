package org.hemanth.spring;

import org.hemanth.spring.interfaces.Framework;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In Main Method");
     ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
     System.out.println("Context"+context);
     
     Framework springFramework=(Framework) context.getBean("springFrameworkBean");
     System.out.println("framework bean"+springFramework.getName());
     
     
     springFramework.setName("Spring New Version");
     
     Framework springFramework1=(Framework) context.getBean("springFrameworkBean");
     System.out.println("framework bean"+springFramework1.getName());
     
/*     System.out.println("framework bean"+springFramework);
     System.out.println("Framework Name : - "+springFramework.getName());
     Framework hibernateFramework=(Framework) context.getBean("hibernateFrameworkBean");
     System.out.println("framework bean"+hibernateFramework);
     System.out.println("Framework Name : - "+hibernateFramework.getName());
     System.out.println("Imported from git hub");*/
	}

}
