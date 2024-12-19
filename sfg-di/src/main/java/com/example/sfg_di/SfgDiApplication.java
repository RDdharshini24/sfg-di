package com.example.sfg_di;

import com.example.sfg_di.Controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting =myController.sayHello();
		System.out.println();
		System.out.println(greeting);
		System.out.println();

		System.out.println("------------profile implementation---------");
		I18Controller i18Controller = (I18Controller)ctx.getBean("i18Controller");
		System.out.println(i18Controller.sayHello());
		System.out.println();


		System.out.println("------------primary implementation--------------");
		System.out.println(myController.getGreeting());
		System.out.println();

		System.out.println("-------------property injection------------------");
		PropertyInjectedController propertyInjectedController =(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println();

		System.out.println("------------constructor injection----------------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		System.out.println();

		System.out.println("-------------setter injection--------------------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
	}

}
