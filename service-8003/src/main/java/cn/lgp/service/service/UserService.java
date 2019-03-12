package cn.lgp.service.service;

import cn.lgp.service.entity.User;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

public interface UserService extends IService<User> {

    List getList();
}
