package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
       // ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

        //Here even if we change bean name /or we try to change springs callback method
        //It will show changes on terminal but their will be no change inside spring
//        UserService userService = context.getBean(UserService.class);
//        userService.setBeanName("userBean2");

        CartService cart = context.getBean(CartService.class);
        System.out.println(cart.getValue(1));

        context.close();
    }
}

/*
* why configurable context => Bcoz ApplicationContext is interface ,and it does not have close()
* and configurable is its child interface that has close() */