package com.chen.contoller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.pojo.MyBook;
import com.chen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController2 {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<MyBook> selectAllBook(){
        return bookService.list();
    }

    @GetMapping("{id}")
    public MyBook selectBook(@PathVariable int id){
        return bookService.getById(id);
    }

    @PostMapping
    public boolean insertBook(@RequestBody MyBook myBook){
        return bookService.save(myBook);
    }

    @PutMapping
    public boolean updateBook(@RequestBody MyBook myBook){
        return bookService.updateById(myBook);
    }

    @DeleteMapping("{id}")
    public boolean deleteBook(@PathVariable int id){
        return bookService.removeById(id);
    }

    @GetMapping("/{currentPage}/{sizePage}")
    public List<MyBook> pageSelect(@PathVariable int currentPage,@PathVariable int sizePage){
        return bookService.page(new Page(currentPage,sizePage)).getRecords();
    }
}
