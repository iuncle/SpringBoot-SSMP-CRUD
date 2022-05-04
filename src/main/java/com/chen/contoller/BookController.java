package com.chen.contoller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.contoller.util.R;
import com.chen.pojo.MyBook;
import com.chen.service.BookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public R selectAllBook(){
        return new R(true,bookService.list());
    }

    @GetMapping("{id}")
    public R selectBook(@PathVariable int id){
        return new R(true,bookService.getById(id));
    }

    @PostMapping
    public R insertBook(@RequestBody MyBook myBook){
        return new R(bookService.save(myBook));
    }

    @PutMapping
    public R updateBook(@RequestBody MyBook myBook){
        return new R(bookService.updateById(myBook));
    }

    @DeleteMapping("{id}")
    public R deleteBook(@PathVariable int id){
        return new R(bookService.removeById(id));
    }

//    @GetMapping("/{currentPage}/{sizePage}")
//    public R pageSelect(@PathVariable int currentPage,@PathVariable int sizePage){
//        Page page = bookService.page(new Page(currentPage, sizePage));
//        if(currentPage>page.getPages()){
//            page=bookService.page(new Page(1,sizePage));
//        }
//        return new R(true,page);
//    }

    @GetMapping("/{currentPage}/{sizePage}")
    public R pageSelect(@PathVariable int currentPage,@PathVariable int sizePage,MyBook book){
        LambdaQueryWrapper<MyBook> lqw = new LambdaQueryWrapper<>();
        lqw.like(Strings.isNotEmpty(book.getName()),MyBook::getName,book.getName());
        lqw.like(book.getPrice()!=null,MyBook::getPrice,book.getPrice());
        lqw.like(Strings.isNotEmpty(book.getDetail()),MyBook::getDetail,book.getDetail());

        Page page = bookService.page(new Page(currentPage, sizePage),lqw);
        if(currentPage>page.getPages()){
            page=bookService.page(new Page(1,sizePage),lqw);
        }
        return new R(true,page);
    }
}
