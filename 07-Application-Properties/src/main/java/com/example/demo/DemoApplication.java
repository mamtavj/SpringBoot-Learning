package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);


		//	PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);

		//		paymentGateway.setRetryCount(5);
		//		paymentGateway.setType("Paytm");

		// paymentGateway.print();      no need of this we are calling this method from runner method
	}

}

/*
*After Using Runner class main looks more clean
* Once application get started Runner class is executed */