package org.own.dive.in.spring.boot.overview.service;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("java7")
@Service
public class CalculateServiceJava7Service implements CalculateService{
    @Override
    public int calculateSum(Integer... values) {
        System.out.println("java 7....计算");
        return 0;
    }
}
