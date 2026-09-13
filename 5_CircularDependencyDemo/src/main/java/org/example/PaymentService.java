package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    private  OrderService orderService;

//    @Autowired
//    public PaymentService(OrderService orderService){
//        this.orderService = orderService;
//    }

    void pay(){
        System.out.println("Payment done");

        //Not its responsibility it should be handled in orderService class otherwise this will create circular dependency
        //orderService.getOrderDetails();
    }
}
