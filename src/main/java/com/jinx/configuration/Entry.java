package com.jinx.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 项目启动入口
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.jinx")
public class Entry {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Entry.class, args);
    }
}
