package com.luoran.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.luoran.common.security.annotation.EnableCustomConfig;
import com.luoran.common.security.annotation.EnableRyFeignClients;
import com.luoran.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 *
 * @author guohailong
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class GenApplication {
    public static void main(String[] args) {
        SpringApplication.run(GenApplication.class, args);
        System.out.println("============================================================");
        System.out.println("======================代码生成模块启动成功======================");
        System.out.println("============================================================");
    }
}
