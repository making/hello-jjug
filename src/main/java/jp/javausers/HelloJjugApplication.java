package jp.javausers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(proxyBeanMethods = false)
@RestController
public class HelloJjugApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloJjugApplication.class, args);
    }

    @GetMapping(path = "/")
    public String hello() {
        return "Hello JJUG!";
    }
}
