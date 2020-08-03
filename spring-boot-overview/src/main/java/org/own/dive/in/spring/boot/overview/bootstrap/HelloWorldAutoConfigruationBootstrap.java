package org.own.dive.in.spring.boot.overview.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
public class HelloWorldAutoConfigruationBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(HelloWorldAutoConfigruationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);


        String helloWorld = context.getBean("helloWorld",String.class);
        System.out.println(helloWorld);

        context.close();

    }

}
