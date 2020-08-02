package org.own.dive.in.spring.boot.overview.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@MyFirstComponent
public @interface MySecondComponent {
}
