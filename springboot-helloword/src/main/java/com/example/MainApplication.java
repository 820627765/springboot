package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring boot 应用
 */
@SpringBootApplication
public class MainApplication implements ImportSelector {
    public static void main(String[] args) {
        //运行这句话就会启动springboot应用
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[0];
    }
}
