package com.luoran.modules.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 监控中心
 *
 * @author guohailong
 */
@EnableAdminServer
@SpringCloudApplication
public class MonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class, args);
        System.out.println("============================================================");
        System.out.println("======================监控中心模块启动成功======================");
        System.out.println("============================================================");
    }
}
