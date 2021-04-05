package com.luoran.job;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.luoran.common.security.annotation.EnableCustomConfig;
import com.luoran.common.security.annotation.EnableRyFeignClients;
import com.luoran.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 *
 * @author guohailong
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class JobApplication {
    public static void main(String[] args) {
        SpringApplication.run(JobApplication.class, args);
        System.out.println("============================================================");
        System.out.println("======================定时任务模块启动成功======================");
        System.out.println("============================================================");
    }
}
