package home.sabapathy.jms.actors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import home.sabapathy.jms.model.Message;

@Component
public class Publisher
{
    @Autowired
    private JmsTemplate jmsTemplate;

    public void publishMessage()
    {
        System.out.println("Sending a message.");
        jmsTemplate.convertAndSend("aTopic", new Message("hello, world!"));
    }
}
