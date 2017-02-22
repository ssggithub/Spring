package com.atguigu.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 1. 创建 Spring 的 IOC 容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		// 2. 从 IOC 容器中获取 bean 的实例
		// 根据类型来获取 bean 的实例: 要求在 IOC 容器中只有一个与之类型匹配的 bean, 若有多个则会抛出异常.
		// 一般情况下, 该方法可用, 因为一般情况下, 在一个 IOC 容器中一个类型对应的 bean 也只有一个.
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

		// 4. 测试使用集合属性
		User user = (User) ctx.getBean("user");
		System.out.println(user);
	}
}
