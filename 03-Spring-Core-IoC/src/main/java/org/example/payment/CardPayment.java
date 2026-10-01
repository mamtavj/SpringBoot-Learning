package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary or
@Qualifier("cp")
public class CardPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("card payment done");
    }
}
