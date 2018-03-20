package com.sfy;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("Beans.xml");
		// HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
		// obj.getMessage();

		// BeanFactory的使用
		// XmlBeanFactory beanFactory = new XmlBeanFactory(new
		// ClassPathResource("Beans.xml"));
		// HelloWorld obj = (HelloWorld)beanFactory.getBean("helloWorld");
		// obj.getMessage();

		// 测试bean的作用域(singleton与property)
		// singleton（默认）
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("Beans.xml");
		// HelloWorld objA = (HelloWorld)context.getBean("helloWorld");
		// objA.setMessage("I am object A");
		// objA.getMessage();
		// HelloWorld objB = (HelloWorld)context.getBean("helloWorld");
		// objB.getMessage();

		// property(创建新的bean)
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("Beans.xml");
		// HelloWorld objA = (HelloWorld)context.getBean("helloWorld");
		// objA.setMessage("I am object A");
		// objA.getMessage();
		// HelloWorld objB = (HelloWorld)context.getBean("helloWorld");
		// objB.getMessage();

		// 测试声明周期
		// AbstractApplicationContext context = new
		// ClassPathXmlApplicationContext(
		// "Beans.xml");
		// HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		// obj.getMessage();
		// //销毁
		// context.registerShutdownHook();

		// 测试后置处理器（）
		// AbstractApplicationContext context = new
		// ClassPathXmlApplicationContext(
		// "Beans.xml");
		// HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		// obj.getMessage();
		// context.registerShutdownHook();

		// 测试继承（注意bean.xml并没有为helloIndia创建message2）
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "Beans.xml");
		// HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		// objA.getMessage1();
		// objA.getMessage2();
		// HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		// objB.getMessage1();
		// objB.getMessage2();
		// objB.getMessage3();

		// 测试依赖注入(构造函数方式,设置方式注入，内部bean)
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "Beans.xml");
		// TextEditor te = (TextEditor) context.getBean("textEditor");
		// te.spellCheck();

		// 测试集合
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "Beans.xml");
		// JavaCollection jc = (JavaCollection)
		// context.getBean("javaCollection");
		// jc.getAddressList();
		// jc.getAddressSet();
		// jc.getAddressMap();
		// jc.getAddressProp();

		// 测试byName,byType,byConstructor自动装配
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();

	}

}
