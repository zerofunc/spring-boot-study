package me.hj.springinit;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args)  {
        System.out.println(args.getOptionNames());
    }
}

