package cn.lgp.consume.controller;

import cn.lgp.service.entity.FeignInterface;
import cn.lgp.service.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {



    @Resource
    FeignInterface feignInterface;


    @RequestMapping(value = "/consumer/get")
    public User get()
    {
        return this.feignInterface.get();
    }

}
