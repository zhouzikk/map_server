package com.zhouzi.map_server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhouzi.map_server.domain.User;
import com.zhouzi.map_server.mapper.UserMapper;
import com.zhouzi.map_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
* @author 16267
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-05-07 10:39:00
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Optional<User> getUserById(Integer id) {
        User user = userMapper.selectById(id);
        Optional<User> result = Optional.of(user);

        return result;
    }
}
