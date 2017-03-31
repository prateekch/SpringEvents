package com.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EmailListener implements ApplicationListener<EmailEvent> {
    public void onApplicationEvent(EmailEvent event) {
        if(event.getSource() instanceof Email)
        {
            Email email= (Email) event.getSource();
            System.out.println("Email is send to ----"+email.getToMail()+"\n from : "+email.getFromMAil()+" with subject" +
                    " :"+email.getSubject());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Email is : \n" +email.getBody());
        }

    }
}
