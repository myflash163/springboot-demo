package com.example;

import com.example.bean.Dog;
import com.example.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTest {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Person person;
    @Autowired
    private Dog dog;
    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService() {
        System.out.println("containsBean helloService:" + ioc.containsBean("helloService"));
        System.out.println("containsBean helloService1:" + ioc.containsBean("helloService1"));
    }

    @Test
    public void contextLoads() {
        logger.trace("trace-----");
        logger.debug("debug-----");
        logger.info(person.toString());
        logger.info(dog.toString());
        logger.warn("warn-----");
        logger.error("error-----");

    }

}
