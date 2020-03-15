package com.company.good;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfoConfig {
    @Bean
    public  com.company.good.MallardDuck mallardDuck() {
        return new  com.company.good.MallardDuck();
    }

    @Bean
    public com.company.good.ModelDuck modelDuck() {
        return new ModelDuck();
    }
}
