package com.sfy.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {

	public static void main(String[] args) {
		// 测试@required
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "Beans2.xml");
		// Student student = (Student) context.getBean("student");
		// System.out.println("Name : " + student.getName());
		// System.out.println("Age : " + student.getAge());

		// 测试@Autowired setter方法，构造函数，属性
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "Beans2.xml");
		// TextEditor te = (TextEditor) context.getBean("textEditor");
		// te.spellCheck();

		// @Autowired 的（required=false） 表示不是必须的

		// 测试java配置方法做的配置
		// ApplicationContext ctx = new AnnotationConfigApplicationContext(
		// HelloWorldConfig.class);
		// HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		// helloWorld.setMessage("Hello World!");
		// helloWorld.getMessage();

		// bean注入
		// ApplicationContext ctx = new AnnotationConfigApplicationContext(
		// TextEditorConfig.class);
		// TextEditor te = ctx.getBean(TextEditor.class);
		// te.spellCheck();

		// 测试事件
		// ConfigurableApplicationContext context = new
		// ClassPathXmlApplicationContext("Beans2.xml");
		// context.start();
		// HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		// obj.getMessage();
		// context.stop();

		// 自定义事件
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
//				"Beans2.xml");
//		CustomEventPublisher cvp = (CustomEventPublisher) context
//				.getBean("customEventPublisher");
//		cvp.publish();
//		cvp.publish();
		
		
		

	}

}
