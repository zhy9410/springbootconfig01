package com.config;

import com.config.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestApplication {
    @Autowired
    Person person;
    @Test
    public void sayHello(){
        System.out.println("hello world");
    }
    @Test
    public void testPerson(){
        System.out.println(person);
    }
}
