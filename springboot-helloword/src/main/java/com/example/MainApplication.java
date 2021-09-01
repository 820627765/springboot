package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring boot 应用
 */
@SpringBootApplication
@EnableCaching  // 表示启用spring缓存
public class MainApplication {
    public static void main(String[] args) {
        //运行这句话就会启动springboot应用
        SpringApplication.run(MainApplication.class, args);
    }
}
