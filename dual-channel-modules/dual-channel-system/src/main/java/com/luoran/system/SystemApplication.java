package com.luoran.system;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.luoran.common.security.annotation.EnableCustomConfig;
import com.luoran.common.security.annotation.EnableRyFeignClients;
import com.luoran.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 *
 * @author guohailong
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
        System.out.println("=========================================================");
        System.out.println("======================系统模块启动成功======================");
        System.out.println("=========================================================");
    }
}
