package com.scs.soft.zhifu.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.scs.soft.zhifu.api.mapper")
public class ZhifuApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhifuApiApplication.class, args);
    }

}
