package com.example.config;

import com.example.service.HelloService;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    @Bean
    @ConditionalOnMissingBean
/*    @ConditionalOnBean
    @ConditionalOnExpression
    @ConditionalOnSingleCandidate
    @ConditionalOnProperty
    @ConditionalOnResource
    @ConditionalOnWebApplication
    @ConditionalOnNotWebApplication
    @ConditionalOnJndi*/
    public HelloService helloService(){
        return new HelloService();
    }
}
