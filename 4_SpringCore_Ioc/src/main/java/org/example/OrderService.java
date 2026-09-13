package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

     private final PaymentService paymentService;                          //above this if we write @Autowired that becomes field injection

    @Autowired
    public OrderService(@Qualifier("cp") PaymentService paymentService){   //constructor injection
        this.paymentService = paymentService;
    }
//       @Autowired
//       public void setPaymentService(PaymentService paymentService){    //setter injection
//           this.paymentService = paymentService;
//        }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed");
    }
}
