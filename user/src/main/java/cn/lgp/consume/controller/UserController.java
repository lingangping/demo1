package cn.lgp.consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

    //public static String url = "http://localhost:8001";

    public static String url = "http://LGP-service";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/user/list")
    public List get(){
        List list = restTemplate.getForObject(url+"/list",List.class);
        return list;
    }
    @GetMapping("/user/discovery")
    public Object discovery(){
        Object o = restTemplate.getForObject(url+"/discovery",Object.class);
        return o;
    }


}
