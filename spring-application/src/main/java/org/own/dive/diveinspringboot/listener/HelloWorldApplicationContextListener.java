package org.own.dive.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;


@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("ContextRefreshedEvent: " + event.getApplicationContext().getId() +
                " timestamp: " + event.getTimestamp());
    }
}
