package com.chen.service.impl;

import com.chen.dao.mapper.UserMapper;
import com.chen.dao.pojo.Book;
import com.chen.dao.pojo.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: 那就叫小智吧
 * @date: 2022/7/7 17:06
 * @Version 1.0
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public List<User> listUser() {
        return userMapper.selectList(null);
    }

    @Override
    public User OneUser(Long id) {
        User user = userMapper.selectById(id);
        String url = "http://bookservice/book/one/"+user.getBookId();
        Book book = restTemplate.getForObject(url, Book.class);
        user.setBook(book);
        return user;
    }


}
