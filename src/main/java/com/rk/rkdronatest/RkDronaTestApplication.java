package com.rk.rkdronatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RkDronaTestApplication {

    @GetMapping
    public String hello(){
        return "Hello Rashmikanta";
    }
    public static void main(String[] args) {
        SpringApplication.run(RkDronaTestApplication.class, args);
    }

}
