package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
       // System.out.println("PaymentService not started yet");
        order.placeOrder();

    }
}

/*
 * Here when order.placeOrder() will be called
 * paymentService.pay() is seen then spring try to wire it with OrderService,
 * but it sees ki object has not been created as it is declared as Lazy
 * first it creates object and store in ioc container then wires it with OrderService*/