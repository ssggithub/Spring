package com.atguigu.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 1. ���� Spring �� IOC ����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		// 2. �� IOC �����л�ȡ bean ��ʵ��
		// ������������ȡ bean ��ʵ��: Ҫ���� IOC ������ֻ��һ����֮����ƥ��� bean, ���ж������׳��쳣.
		// һ�������, �÷�������, ��Ϊһ�������, ��һ�� IOC ������һ�����Ͷ�Ӧ�� bean Ҳֻ��һ��.
		/*
		 * HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		 * helloWorld.hello();
		 * 
		 * HelloWorld helloWorld2 = (HelloWorld) ctx.getBean("helloWorld2");
		 * helloWorld2.hello();
		 */

		/*
		 * Car car1 = (Car) ctx.getBean("car1"); System.out.println(car1);
		 * 
		 * Car car2 = (Car) ctx.getBean("car2"); System.out.println(car2);
		 */

		/*
		 * Person person = (Person) ctx.getBean("person");
		 * System.out.println(person);
		 * 
		 * Person person2 = (Person) ctx.getBean("person2");
		 * System.out.println(person2);
		 * 
		 * Person person3 = (Person) ctx.getBean("person3");
		 * System.out.println(person3);
		 */

		// 4. ����ʹ�ü�������
		User user = (User) ctx.getBean("user");
		System.out.println(user);
	}
}
