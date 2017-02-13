package com.iqmsoft.boot.vertx;

import io.vertx.core.Vertx;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@EnableMongoRepositories(basePackages = "com.iqmsoft.boot.vertx.repos")
@ComponentScan(basePackages = "com.iqmsoft.boot.vertx")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Vertx vertx() {
        Vertx vertx = Vertx.vertx();
        return vertx;
    }

}
