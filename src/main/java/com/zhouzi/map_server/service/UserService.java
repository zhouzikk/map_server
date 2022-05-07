package com.zhouzi.map_server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhouzi.map_server.domain.User;

import java.util.Optional;

/**
* @author 16267
* @description 针对表【user】的数据库操作Service
* @createDate 2022-05-07 10:39:00
*/
public interface UserService extends IService<User> {

    Optional<User> getUserById(Integer id);
}
