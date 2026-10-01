package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements ApplicationRunner {

    private PaymentGateway paymentGateway;

    public DemoRunner(PaymentGateway paymentGateway){
        this.paymentGateway =paymentGateway;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        paymentGateway.print();
    }
}
/*
* ApplicationRunner is that it gives us a proper place to execute code automatically,
*  after Spring Boot has started and all beans have been created.*/

//We can also use CommandLineRunner interface instead of ApplicationRunner

