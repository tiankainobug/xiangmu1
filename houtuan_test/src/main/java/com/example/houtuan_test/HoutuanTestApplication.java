package com.example.houtuan_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.houtuan_test.mapper")
public class HoutuanTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(HoutuanTestApplication.class, args);
    }

}
