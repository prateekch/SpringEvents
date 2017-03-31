package com.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class EmailPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
      publisher =  applicationEventPublisher;
    }
    public void publish(EmailEvent event){
        publisher.publishEvent(event);
    }
}
