package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    private  PaymentService paymentService;

    @Autowired
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void placeOrder(){
        paymentService.pay();

        getOrderDetails();

        System.out.println("Order placed");
    }

    public void getOrderDetails(){
        System.out.println("Order Details");
    }
}
