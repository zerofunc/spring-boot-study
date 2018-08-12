package me.hj.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class SpringinitApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(SpringinitApplication.class)
                .build()
                .run(args);
    }
}
