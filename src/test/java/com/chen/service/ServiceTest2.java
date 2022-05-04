package com.chen.service;

import com.chen.pojo.MyBook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTest2 {
    @Autowired
    private BookService2 bookService;

    @Test
    void testSelect(){
        System.out.println(bookService.select(1));
    }

    @Test
    void testInsert(){
        MyBook myBook = new MyBook("mysql", "从入门到跑路", 20);
        bookService.insert(myBook);
    }
}
