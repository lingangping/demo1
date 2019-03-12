package cn.lgp.service.service.impl;


import cn.lgp.service.mapper.UserMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import cn.lgp.service.entity.User;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List getList (){
        Wrapper<User> wrapper = new EntityWrapper<User>() ;
        List<User> userList = userMapper.selectList(wrapper);
        return userList;

    }
}

