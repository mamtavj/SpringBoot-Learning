package org.example;

import org.example.Notification.EmailService;
import org.example.Notification.NotificationService;

import javax.management.Notification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationService notification = new EmailService();

        //OrderService order = new OrderService(notification);
        OrderService order = new OrderService();
        order.setNotification(notification);  //Injecting email notification through setter
        order.placeOrder();
    }
}
//A class should ask what it needs and
// not build everything itself

//IOC=Inversion of control