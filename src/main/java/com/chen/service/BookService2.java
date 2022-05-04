package com.chen.service;

import com.chen.pojo.MyBook;

import java.util.List;

public interface BookService2 {
    int insert(MyBook book);
    int update(MyBook book);
    int delete(int id);
    MyBook select(int id);
    List<MyBook> selectAll();
}
