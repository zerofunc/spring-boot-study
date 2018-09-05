package my.hj.springcorsserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringcorsserverApplication {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringcorsserverApplication.class, args);
    }
}
