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
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		helloWorld.hello();
	}
}
