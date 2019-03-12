package cn.lgp.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LgpEurekaServer7003Application {

    public static void main(String[] args){
        SpringApplication.run(LgpEurekaServer7003Application.class,args);
    }

}
