package com.chen.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.mapper.BookMapper;
import com.chen.pojo.MyBook;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, MyBook> implements BookService {
}
