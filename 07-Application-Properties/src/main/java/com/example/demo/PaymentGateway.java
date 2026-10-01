package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

    //(@Value("${paymentGateway.type:RazorPay}")        //If property is not available we give default value
    //private String type;

    //@Value("${paymentGateway.retry-count}")           //If already property is available
    //private int retryCount;

    // First way to get properties from application properties

    //    public PaymentGateway(@Value("${paymentGateway.type}") String type,
    //                          @Value("${paymentGateway.retry-count}") int retryCount) {
    //        this.type = type;
    //        this.retryCount = retryCount;
    //    }
    //
    //    public String getType(){
    //        return type;
    //    }
    //
    //    public void setType(String type){
    //        this.type = type;
    //    }
    //    public int getRetryCount(){
    //        return retryCount;
    //    }
    //    public void setRetryCount(int retryCount){
    //        this.retryCount = retryCount;
    //    }

    //------------------------------------------------------------------

    //Another way to get properties from class that have group of properties(@ConfigurationProperties)
    private PaymentProperties paymentProperties;

    // Spring automatically injects the PaymentProperties bean here
    public PaymentGateway(PaymentProperties paymentProperties){
        this.paymentProperties = paymentProperties;
    }

    //we need getter bcoz PaymentGateway reads configured values ,
    //we don't want it to make any changes to those
    //Because configuration is supposed to come from application.properties
    public String getType(){
        return paymentProperties.getType();
    }
    public int getRetryCount(){
        return paymentProperties.getRetryCount();
    }
    public boolean isEnabled(){
        return paymentProperties.isEnabled();
    }
    public int getTimeout() {
        return paymentProperties.getTimeout();
    }

    public void print(){
        System.out.println(getRetryCount());
        System.out.println(getType());
        System.out.println(isEnabled());
        System.out.println(getTimeout());
    }
}


//-----------------------------------------------------------------
/*Why is their need for doing this???

* =>We could achieve this without using application.properties instead ,
*   using normal constructor initialization
*
* =>Imagine tomorrow you want to change Paytm to Razorpay and
*    retry count from 5 to 3
*
* =>Without application.properties, you'd have to modify Java code*/

//-----------------------------------------------------------------------------

// @Value("${property-name}") gets the value of the
// specified property from application.properties.
//
// ${paymentGateway.type}  -> gets "paytm"
// ${paymentGateway.retry-count} -> gets 5
//
//------------------------------------------------------------------------

