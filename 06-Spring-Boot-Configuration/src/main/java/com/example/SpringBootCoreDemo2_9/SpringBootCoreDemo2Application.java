package com.example.SpringBootCoreDemo2_9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//@SpringBootApplication consists of these three annotations
//So instead of writing all three we use @SpringBootApplication
//
// 1. @SpringBootConfiguration =>tells spring that this is configuration class
//
// 2. @ComponentScan => tells spring to scan packages and subpackages for classes such as
//    @Component , @Controller , @Service etc
//
// 3. @EnableAutoConfiguration => Looks at the dependencies our application needs and automatically configure things as per dependencies


@SpringBootApplication
public class SpringBootCoreDemo2Application {

	public static void main(String[] args) {

		// SpringApplication.run() => starts the Spring Boot application.
		// It creates the Spring ApplicationContext (IoC Container),
		// performs component scanning, applies autoconfiguration,
		// creates Beans, performs dependency injection,
		// and finally makes the application ready.
		//
		// run() actually returns ConfigurableApplicationContext.
		//
		// ConfigurableApplicationContext inherits ApplicationContext,so parent type reference
		// can hold child object
		//
		//context holds reference to spring IOC container
		//we can use this context for getting beans

		ApplicationContext context = SpringApplication.run(SpringBootCoreDemo2Application.class, args);

		OrderService orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
	}

}
	//@EnableConfiguration:
	//
	//It performs automatic configuration as per dependencies in our pom.xml,

	// Before auto-configuration it checks does not blindly create everything:
	//
	// 1. Dependencies available on the classpath
	// 2. Existing Beans/configuration
	// 3. Conditions defined by Spring Boot's auto-configuration

	//========================================================================

	// Two important conditional annotations you will commonly see:
	//
	// @ConditionalOnClass
	// → Apply this configuration when a particular class is
	//   available on the classpath.
	//
	// @ConditionalOnMissingBean
	// → Apply/create the default configuration only when the
	//   application has not already defined a matching Bean by developer.

	// @Bean examples
	// ------------------------------------------------------------
	//
	// Creating a Bean for a class from an external library:
	//
	// @Bean
	// public JsonParser getJsonParserBean() {
	//     return new BasicJsonParser();
	// }
	//
	// We cannot normally add @Component to BasicJsonParser because
	// its source code belongs to an external library and is read only.
	//
	// Therefore, @Bean allows us to manually create the object
	// and let Spring manage the returned object as a Bean.
	//	}

	//==================================================================

	// Explicit Bean Configuration
	// ------------------------------------------------------------
	//
	// @Bean methods can be declared inside a configuration class.
	//
	// Example:
	//
	// @Bean
	// public JsonParser getJsonParserBean() {
	//     return new BasicJsonParser();
	// }
	//
	// Spring calls this method during configuration and registers
	// the returned object as a Bean.

	//-------------------------------------------------------------------
	//Imp takeaways and revision points :

    // 1.
	// @SpringBootApplication
	//     1. @SpringBootConfiguration
	//     2. @ComponentScan
	//     3. @EnableConfiguration

	// 2. How SpringApplication.run() runs

