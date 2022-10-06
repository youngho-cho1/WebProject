package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com")
public class JoinApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoinApplication.class, args);
    }

}
