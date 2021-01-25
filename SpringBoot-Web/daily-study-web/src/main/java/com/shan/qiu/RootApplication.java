package com.shan.qiu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: wangshuo
 * @Date: 2021/1/22 15:27
 */
@SpringBootApplication
@MapperScan(value = "com.shan.qiu.mapper")
public class RootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RootApplication.class, args);
    }
}
