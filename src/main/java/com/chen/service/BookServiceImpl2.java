package com.chen.service;

import com.chen.mapper.BookMapper;
import com.chen.pojo.MyBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl2 implements BookService2 {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public int insert(MyBook book) {
        return bookMapper.insert(book);
    }

    @Override
    public int update(MyBook book) {
        return bookMapper.updateById(book);
    }

    @Override
    public int delete(int id) {
        return bookMapper.deleteById(id);
    }

    @Override
    public MyBook select(int id) {
        return bookMapper.selectById(id);
    }

    @Override
    public List<MyBook> selectAll() {
        return bookMapper.selectList(null);
    }
}
