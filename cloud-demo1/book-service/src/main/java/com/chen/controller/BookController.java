package com.chen.controller;

import com.chen.dao.pojo.Book;
import com.chen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: 那就叫小智吧
 * @date: 2022/7/7 16:45
 * @Version 1.0
 * @Description:
 */
@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("list")
    private List<Book> ListBooksView() {
        return bookService.listBook();
    }
}
