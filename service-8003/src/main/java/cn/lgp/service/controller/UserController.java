package cn.lgp.service.controller;

import cn.lgp.service.entity.User;
import cn.lgp.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @Resource
    DiscoveryClient client;

    @GetMapping("/discovery")
    public Object discovery(){
        List<String> list = client.getServices();
        System.out.println("*******"+list);
        List<ServiceInstance> serviceInstanceList =client.getInstances("LGP-SERVICE");
        for (ServiceInstance service: serviceInstanceList) {
            System.out.println(service.getServiceId()+"\t"+service.getHost()+"\t"+service.getPort()+"\t"+service.getUri());
        }
        return this.client;
    }

    @GetMapping("/list")
    public List getList(){
        List<User> userList = userService.getList();
        System.out.println("这是80033333333333333"+userList.toString());
        return  userList;
    }


}
