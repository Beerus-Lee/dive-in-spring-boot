package org.own.dive.in.spring.boot.overview.bootstrap;

import org.own.dive.in.spring.boot.overview.annotation.EnableHelloWorld;
import org.own.dive.in.spring.boot.overview.repository.MyFirstRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


@EnableHelloWorld
public class HelloWorldConfigruationApplicationDemo {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(HelloWorldConfigruationApplicationDemo.class)
                .web(WebApplicationType.NONE)
                .run();

        String helloWorld = context.getBean("helloWorld",String.class);
        System.out.println("helloWorld: " + helloWorld);

        context.close();
    }
}
