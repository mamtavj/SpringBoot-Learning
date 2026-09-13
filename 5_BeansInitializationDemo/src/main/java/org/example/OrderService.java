package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    PaymentService paymentService;

    public  OrderService(@Lazy PaymentService paymentService){  //here proxy object is passed
        this.paymentService = paymentService;
        System.out.println("OrderService created");
    }

    public void placeOrder(){
        paymentService.pay();

        System.out.println("Order placed");
    }
    public void OrderDetails(){
        System.out.println("Order Details");
    }
}
