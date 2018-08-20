package me.hj.springinit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SimpleRunner.class);
    @Autowired
    private String hello;

    @Autowired
    private HJProperties hjProperties;
    @Override
    public void run(ApplicationArguments args)  {
        logger.info("-=======================-");
        logger.info(hello);
        logger.info(hjProperties.getName());
        logger.info(hjProperties.getFullName());
        logger.info("-=======================-");
    }
}

