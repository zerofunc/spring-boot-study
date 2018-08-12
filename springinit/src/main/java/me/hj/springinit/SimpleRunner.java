package me.hj.springinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleRunner implements ApplicationRunner {

    @Autowired
    private HJProperties hjProperties;

    @Override
    public void run(ApplicationArguments args)  {
        System.out.println("=======================");
        System.out.println(hjProperties.getFullName());
        System.out.println(hjProperties.getAge());
        System.out.println("=======================");
    }
}

