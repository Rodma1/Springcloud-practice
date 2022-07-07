package com.chen.service;

import com.chen.dao.pojo.User;

import java.util.List;

/**
 * @author: 那就叫小智吧
 * @date: 2022/7/7 17:00
 * @Version 1.0
 * @Description:
 */
public interface UserService {
    List<User> listUser();

    User OneUser(Long id);
}
