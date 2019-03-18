package com.example.rabbitmq.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RabbitmqController {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @GetMapping("direct")
    public void direct(){
//        Map<String,Object> map = new HashMap<>();
//        map.put("msg","这是第一个");
//        map.put("data", Arrays.asList("helloworld",123,true));
//        rabbitTemplate.convertAndSend("lgp.direct","lgp.news",map);
//        System.out.println("jieshule");
    }
}
