package com.event;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Component
public class CustomEvents implements ApplicationListener<ContextStartedEvent> {
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("Application CONTEXT STARTED");

    }



    /*public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("CONTEXT >>");
    }*/
}
