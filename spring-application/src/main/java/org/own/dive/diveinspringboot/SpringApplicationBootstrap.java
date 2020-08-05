package org.own.dive.diveinspringboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

public class SpringApplicationBootstrap {
    public static void main(String[] args) {
        Set<String> sources = new HashSet<>();
        sources.add(SpringApplicationConfigruation.class.getName());

        SpringApplication application = new SpringApplication();
        application.setSources(sources);

        application.run(args );

    }
    @SpringBootApplication
    public static class SpringApplicationConfigruation{

    }
}
