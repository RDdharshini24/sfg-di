package com.example.sfg_di;

import com.example.sfg_di.Controllers.ConstructorInjectedController;
import com.example.sfg_di.Controllers.MyController;
import com.example.sfg_di.Controllers.PropertyInjectedController;
import com.example.sfg_di.Controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting =myController.sayHello();
		System.out.println(greeting);

		System.out.println("------------primary injection--------------");
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
