package org.own.dive.in.spring.boot.overview.bootstrap;

import org.own.dive.in.spring.boot.overview.repository.MyFirstRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(value = "org.own.dive.in.spring.boot.overview.repository")
public class MyRespositoryDemo {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(MyRespositoryDemo.class)
                .web(WebApplicationType.NONE)
                .run();

        MyFirstRepository myFirstRepository = context.getBean(MyFirstRepository.class);
        System.out.println(myFirstRepository);

        context.close();
    }
}
