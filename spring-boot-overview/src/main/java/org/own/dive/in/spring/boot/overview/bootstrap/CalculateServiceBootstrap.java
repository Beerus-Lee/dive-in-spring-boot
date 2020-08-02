package org.own.dive.in.spring.boot.overview.bootstrap;

import org.own.dive.in.spring.boot.overview.service.CalculateService;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "org.own.dive.in.spring.boot.overview.service")
public class CalculateServiceBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("java7")
                .run(args);

        CalculateService calculateService = context.getBean(CalculateService.class);

        System.out.println(calculateService.calculateSum(0));


        context.close();

    }
}
