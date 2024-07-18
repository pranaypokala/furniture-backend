package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@SpringBootApplication(scanBasePackages = {"com.example.demo"})
public class FurnitureappApplication {

    public static void main(String[] args) {
        SpringApplication.run(FurnitureappApplication.class, args);
        System.out.println("Hi, welcome to the website");
    }
}
