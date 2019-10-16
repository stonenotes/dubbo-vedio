package com.av.vedio;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubbo
@ComponentScan(basePackages = {"com.av.vedio.**"})
@MapperScan(basePackages = {"com.av.vedio.mapper"})
public class VedioProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(VedioProviderApplication.class, args);
    }
}
