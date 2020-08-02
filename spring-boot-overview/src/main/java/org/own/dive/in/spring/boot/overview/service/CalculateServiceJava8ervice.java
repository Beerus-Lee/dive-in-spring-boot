package org.own.dive.in.spring.boot.overview.service;


import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("java8")
@Service
public class CalculateServiceJava8ervice implements CalculateService {
    @Override
    public int calculateSum(Integer... values) {
        System.out.println("java 8");
        return 0;
    }
}
