package org.example;

import org.example.payment.CardPayment;
import org.example.payment.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean
    public User createUser(){
        return new User("Aditya",28);
    }

    //Here we created Bean of these two classes to show if we did not write component we can create beans using Bean
//    @Bean
//    public PaymentService createCardPayment(){
//        return new CardPayment();
//    }
//    @Bean
//    public OrderService createOrderService(PaymentService paymentService){
//        return new OrderService(paymentService);
//    }

    //Suppose we are not injecting dependency in OrderService using constructor instead we are using field and setter injection method
    /*
    * @Bean
    * public OrderService createOrderService(){
    *   PaymentService payment = createCardPayment();
    *   OrderService order = new OrderService(payment);
    *   order.setPaymentService(payment);
    *
    *   return order;
    * }*/
}
