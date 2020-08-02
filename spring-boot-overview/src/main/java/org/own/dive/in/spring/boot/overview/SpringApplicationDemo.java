package org.own.dive.in.spring.boot.overview;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringApplicationDemo {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringApplicationDemo.class)
                .web(WebApplicationType.NONE)
                .run();





        context.close();
    }
}
