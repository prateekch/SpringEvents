package com.event;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEvent {
    public static void main(String[] args) {
       ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("Config.xml");
       context.start();


        Email email=new Email().setToMail("abc@tothenew.com")
                .setSubject("HELLO MAIL >>>")
                .setBody("HEHENDNDJDJDDJDJJDJ");

        EmailEvent emailEvent=new EmailEvent(email);

        EmailPublisher publisher=context.getBean(EmailPublisher.class);
        publisher.publish(emailEvent);

        context.stop();


    }
}
