package org.own.dive.in.spring.boot.overview.annotation;


import org.own.dive.in.spring.boot.overview.annotation.configuration.HelloWorldConfiguration;
import org.own.dive.in.spring.boot.overview.annotation.configuration.HelloWorldImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(HelloWorldConfiguration.class)
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {

}
