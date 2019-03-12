package cn.lgp.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("cn.lgp.service.mapper")
//本服务启动后会自动注册进eureka服务中
@EnableEurekaClient
public class LgpService8002Application {

    public static void main(String[] args){
        SpringApplication.run(LgpService8002Application.class,args);

    }
}
