package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    public void Demo(){
        System.out.println("Call from AppConfig class constructor");
    }
//    @Bean(initMethod = "start", destroyMethod = "stop")           //Initialization using Init Method
//    public CartService getCartBeans(){
//        return new CartService();
//    }
}
