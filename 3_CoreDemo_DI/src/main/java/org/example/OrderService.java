package org.example;

import org.example.Notification.EmailService;
import org.example.Notification.NotificationService;

public class OrderService {

    //EmailService notification = new EmailService(); //object creation
    //Instead of making it very tightly bound we can use interface here

    //NotificationService notification = new EmailService();          //interface reference

    NotificationService notification;             //fields

    public OrderService(NotificationService notification) {    //Constructor Injection
        this.notification = notification;
    }
    //Empty constructor => overriding the previous constructor and we are using setter
    public OrderService(){

    }

    public void placeOrder() {
        System.out.println("Order placed");
        notification.sendNotification();
    }

    public void setNotification(NotificationService notification) {      //Setter Injection
        this.notification = notification;
    }
}
