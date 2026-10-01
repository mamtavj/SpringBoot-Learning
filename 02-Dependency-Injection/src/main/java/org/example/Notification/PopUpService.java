package org.example.Notification;

public class PopUpService implements NotificationService{
    @Override
    public void sendNotification(){
        System.out.println("PopUp Notification Sent");
    }
}
