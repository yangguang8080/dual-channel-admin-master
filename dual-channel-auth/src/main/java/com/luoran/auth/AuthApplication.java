package com.luoran.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.luoran.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 *
 * @author guohailong
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
        System.out.println("===============================================================");
        System.out.println("======================认证授权中心模块启动成功======================");
        System.out.println("===============================================================");
    }
}
