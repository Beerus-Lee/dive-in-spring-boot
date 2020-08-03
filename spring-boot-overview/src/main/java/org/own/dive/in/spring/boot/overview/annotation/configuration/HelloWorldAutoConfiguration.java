package org.own.dive.in.spring.boot.overview.annotation.configuration;


import org.own.dive.in.spring.boot.overview.annotation.EnableHelloWorld;
import org.own.dive.in.spring.boot.overview.condition.ConditionOnSystemProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHelloWorld
@ConditionOnSystemProperty(name = "user.name",value = "sxnyd")
public class HelloWorldAutoConfiguration {
}
