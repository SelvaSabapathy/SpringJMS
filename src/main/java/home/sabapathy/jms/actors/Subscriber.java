package home.sabapathy.jms.actors;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import home.sabapathy.jms.model.Message;

@Component
public class Subscriber
{
    @JmsListener(destination = "aTopic", containerFactory = "myFactory")
    public void receiveMessage(Message message)
    {
        System.out.println("Received: \"" + message + "\"");
    }
}