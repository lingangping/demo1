package cn.lgp.service.entity;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "LGP-service")
public interface FeignInterface {

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    User get();
}
