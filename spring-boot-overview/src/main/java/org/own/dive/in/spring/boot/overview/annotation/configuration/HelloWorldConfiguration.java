package org.own.dive.in.spring.boot.overview.annotation.configuration;

import org.springframework.context.annotation.Bean;


public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "hello world";
    }
}
