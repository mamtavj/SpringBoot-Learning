package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); //This means start spring container using Annotation configuration

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

//        PaymentService payment = context.getBean(PaymentService.class);
//        payment.pay();

//         User user = new User("mamta",22);
//         user.getName();

        User user = context.getBean(User.class);
        System.out.print(user.getName());
    }
}