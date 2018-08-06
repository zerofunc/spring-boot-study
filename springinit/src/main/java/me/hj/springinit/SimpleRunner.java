package me.hj.springinit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleRunner implements ApplicationRunner {

    @Value("${hj.fullName}")
    private String name;

    @Value("${hj.age}")
    private String age;
    @Override
    public void run(ApplicationArguments args)  {
        System.out.println("=======================");
        System.out.println(name);
        System.out.println(age);
        System.out.println("=======================");
    }
}

