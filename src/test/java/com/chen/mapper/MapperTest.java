package com.chen.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.pojo.MyBook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MapperTest {

    @Autowired
    private BookMapper bookMapper;

    @Test
    void testSelectAll(){
        List<MyBook> myBooks = bookMapper.selectList(null);
        System.out.println(myBooks);
    }

    @Test
    void testSelect(){
        System.out.println(bookMapper.selectById(1));
    }

    @Test
    void testInsert(){
        MyBook myBook = new MyBook("mysql", "从入门到跑路", 20);
        bookMapper.insert(myBook);
    }

    @Test
    void testUpdate(){
        MyBook myBook = new MyBook(1, "sqlserver", "从跑路到入狱", 30.0);
        bookMapper.updateById(myBook);
    }

    @Test
    void testDelete(){
        bookMapper.deleteById(2);
    }

    @Test
    void testPageSelect(){
        IPage page=new Page(2,5);
        IPage iPage = bookMapper.selectPage(page, null);
        System.out.println(iPage.getRecords());
    }

    @Test
    void testConditionSelect(){
        String name="7777";
        LambdaQueryWrapper<MyBook> lqw = new LambdaQueryWrapper<>();
        lqw.like(name!=null,MyBook::getName,name);
        Page page = new Page(1, 5);
        bookMapper.selectPage(page,lqw);
    }

}
