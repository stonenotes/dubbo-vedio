package com.av.vedio;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubbo
@ComponentScan(basePackages = {"com.av.vedio.**"})
public class VedioConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VedioConsumerApplication.class, args);
    }
}
