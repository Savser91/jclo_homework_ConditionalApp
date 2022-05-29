package ru.netology.conditionalapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConditionalAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConditionalAppApplication.class, args);
    }

}
