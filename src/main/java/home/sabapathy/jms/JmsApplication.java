package home.sabapathy.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import home.sabapathy.jms.actors.Publisher;

@SpringBootApplication
public class JmsApplication
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(JmsApplication.class, args);
        new Publisher(applicationContext).publishMessage();
    }
}
