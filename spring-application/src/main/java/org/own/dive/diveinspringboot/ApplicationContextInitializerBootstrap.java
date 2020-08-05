package org.own.dive.diveinspringboot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApplicationContextInitializerBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ApplicationContextInitializerBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        System.out.println("applicationName: " + context.getClass().getName());
        System.out.println("envirement: " + context.getEnvironment());

        context.close();

    }
}
