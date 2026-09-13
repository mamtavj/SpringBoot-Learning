package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy                 //Don't eagerly create PaymentService when the application context starts.
public class PaymentService {

    OrderService orderService ;

    public PaymentService(OrderService orderService){
        this.orderService = orderService;
        System.out.println("PaymentService created");
    }

    public void pay(){
        System.out.println("payment successful");

        orderService.OrderDetails();
    }

}
