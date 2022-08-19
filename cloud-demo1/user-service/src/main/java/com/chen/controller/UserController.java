package com.chen.controller;

import com.chen.dao.pojo.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author: 那就叫小智吧
 * @date: 2022/7/7 17:10
 * @Version 1.0
 * @Description:
 */
@RestController
@RequestMapping("user")
@RefreshScope(proxyMode = ScopedProxyMode.DEFAULT)
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${pattern.dateformat}")
    private String dateformat;

    @GetMapping("list")
    private List<User> ListUsersView() {
        return userService.listUser();
    }

    @GetMapping("one/{id}")
    private User OneUserView(@PathVariable Long id) {
        return userService.OneUser(id);
    }

    @GetMapping("now")
    private String now() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateformat));
    }
}
