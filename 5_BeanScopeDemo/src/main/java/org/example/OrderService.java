package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope("singleton")              //Eager initialization
//@Scope("prototype")           //lazy Initialization
public class OrderService {

    public OrderService(){
        System.out.println("OrderService created");
    }

    public void placeOrder(){
        System.out.println("Order placed");
    }
}
