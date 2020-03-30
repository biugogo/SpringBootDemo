package com.apollo.springdemo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationDemo {
    @Bean
    public BeanA beanA(BeanParam beanParam) {
        return new BeanA(beanParam);
    }

    @Bean
    public BeanParam beanParam() {
        return new BeanParam();
    }

    @Bean
    public BeanB beanB() {
        return new BeanB(beanParam());
    }
}
