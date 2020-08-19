package home.sabapathy.jms.actors;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import home.sabapathy.jms.model.Message;

public class Publisher
{
    private ConfigurableApplicationContext applicationContext;

    public Publisher(ConfigurableApplicationContext applicationContext)
    {
        this.applicationContext = applicationContext;
    }

    public void publishMessage()
    {
        JmsTemplate jmsTemplate = applicationContext.getBean(JmsTemplate.class);

        System.out.println("Sending a message.");
        jmsTemplate.convertAndSend("aTopic", new Message("hello, world!"));
    }
}
