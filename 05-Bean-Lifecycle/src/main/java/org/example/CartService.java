package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService  implements BeanNameAware, ApplicationContextAware  /*,DisposableBean,implements InitializingBean*/ {

    Map<Integer, String> mp;

    public CartService(){
        mp = new HashMap<>();
        System.out.println("CartService constructor called");
    }
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext name is: " + applicationContext.getClass());
    }

 //    1. This is when we do initialization using the interface InitializingBean
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean is ready");
//        mp.put(1, "Aditya");
//        mp.put(2, "Rohit");
//    }

//     2. This method when we are using Init Method coz this method we declared in App config
//    public void start(){
//        System.out.println("Bean is ready");
//        mp.put(1,"Aditya");
//        mp.put(2, "Rohit");
//    }

//     3. PostConstruct method
    @PostConstruct                 //Need to use Jakarta library
    public void start(){
        System.out.println("Bean is ready");
        mp.put(1,"Aditya");
        mp.put(2, "Rohit");
    }

    public void addCart(){
        System.out.println("Added to cart");
    }
    public String getValue(int key){
        return mp.get(key);
    }

//    1 . Using DisposableBean
//    @Override
//    public void destroy() throws Exception {
//        mp.clear();
//        System.out.println("Bean is getting destroyed");
//    }

//    2 . Using destroyMethod
//    public void stop() {
//        mp.clear();
//        System.out.println("Bean is getting destroyed");
//    }

//    3. Using PreDestroy
    @PreDestroy
      public void stop() {
        mp.clear();
        System.out.println("Bean is getting destroyed");
    }
}
