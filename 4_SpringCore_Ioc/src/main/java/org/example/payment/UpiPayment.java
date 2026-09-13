package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("up")
public class UpiPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("Upi Payment done");
    }
}
