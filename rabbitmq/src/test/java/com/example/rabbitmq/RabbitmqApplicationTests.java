package com.example.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {


    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    public void contextLoads() {

        Map<String,Object> map = new HashMap<>();
        map.put("msg","这是第一个");
        map.put("data", Arrays.asList("helloworld",123,true));
        rabbitTemplate.convertAndSend("l.di","lgp.news",map);
        System.out.println("jieshule");
    }

}
