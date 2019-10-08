package com.av.vedio;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@DubboComponentScan(basePackages = { "com.av.vedio.controller" })
public class VedioConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VedioConsumerApplication.class, args);
    }
}
