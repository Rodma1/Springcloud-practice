package com.chen;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: 那就叫小智吧
 * @date: 2022/7/7 16:01
 * @Version 1.0
 * @Description:
 */
@MapperScan("com.chen.dao.mapper")
@SpringBootApplication
public class BookApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }
}
