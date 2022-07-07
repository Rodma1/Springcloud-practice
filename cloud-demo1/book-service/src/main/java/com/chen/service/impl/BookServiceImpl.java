package com.chen.service.impl;

import com.chen.dao.mapper.BookMapper;
import com.chen.dao.pojo.Book;
import com.chen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 那就叫小智吧
 * @date: 2022/7/7 16:43
 * @Version 1.0
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired(required = false)
    private BookMapper bookMapper;
    @Override
    public List<Book> listBook() {
        return bookMapper.selectList(null);
    }
}
