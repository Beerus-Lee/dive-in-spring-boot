package org.own.dive.in.spring.boot.overview.bootstrap;

import org.own.dive.in.spring.boot.overview.condition.ConditionOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

public class ConditionalOnSystemPropertyBootstrap {


    @Bean
    @ConditionOnSystemProperty(name = "user.name",value = "sxnyd")
    public String helloWorld() {
        return "helloWorld";
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);


        String helloWorld = context.getBean("helloWorld",String.class);
        System.out.println(helloWorld);

        context.close();



    }
}
