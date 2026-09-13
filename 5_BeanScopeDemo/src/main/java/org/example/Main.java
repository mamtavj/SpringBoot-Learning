package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//    OrderService order = context.getBean(OrderService.class);
//    OrderService order2 = context.getBean(OrderService.class);
//        System.out.println(order == order2);

//        OrderService order = new OrderService();

    }
}