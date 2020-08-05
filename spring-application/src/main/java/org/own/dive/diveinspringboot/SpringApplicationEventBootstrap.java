package org.own.dive.diveinspringboot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringApplicationEventBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringApplicationEventBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        context.addApplicationListener(new ApplicationListener<ApplicationEvent>() {
            @Override
            public void onApplicationEvent(ApplicationEvent event) {
                System.out.println("监听到事件： " + event);
            }
        });

        context.publishEvent("helloworld");
        context.publishEvent("2020");
        context.publishEvent(new ApplicationEvent("hellowrod") {
        });

        context.close();
    }
}
