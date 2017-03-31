package com.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Component
public class CustomEventStop implements ApplicationListener<ContextStoppedEvent> {

    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("Application CONTEXT STOPPED");
    }
}
