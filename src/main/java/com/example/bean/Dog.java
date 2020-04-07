package com.example.bean;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
@PropertySource(value = {"classpath:dog.properties"})
@ConfigurationProperties(prefix = "dog")
public class Dog {
    private String name;
    private Integer age;
    private String randomUuid;
    private int randomInt;
    private String affix;
}
