package com.clj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * User: conglanjun
 * Date: 2019/4/9
 * Time: 23:12
 * Description:
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class, args);
    }
}
