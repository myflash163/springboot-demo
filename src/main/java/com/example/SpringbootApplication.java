package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/* @SpringBootApplication 相当于
@Configuration
@EnableAutoConfiguration
@ComponentScan*/
@SpringBootApplication
@ImportResource(locations = {"classpath:beans.xml"})
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
