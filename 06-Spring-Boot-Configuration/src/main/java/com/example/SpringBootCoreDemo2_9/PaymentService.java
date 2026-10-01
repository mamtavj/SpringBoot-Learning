package com.example.SpringBootCoreDemo2_9;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void pay(){
        System.out.println("Payment done");
    }
}
