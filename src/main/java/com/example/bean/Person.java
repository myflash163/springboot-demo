package com.example.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString

@Component
//添加jsr303数据校验
@Validated
/*
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties不支持SpEL 表达式
 * */
@ConfigurationProperties(prefix = "person")
public class Person {
    @Value("${person.last-name}")
    private String lastName;
    /*
     * @Value 优先级低于 @ConfigurationProperties
     * @Value 不支持map list 复杂类型
     * */
    @Value("#{11*2}")
    private Integer age;
    private Boolean boss;
    private Date birth;
    /*
     * 注解校验 仅添加@Validated后有效
     * 对@ConfigurationProperties 有效 对@Value无效
     * */
    @Email
    private String email;

    private Map<String, Object> maps;
    private List<Object> lists;

    private Dog dog;


}
