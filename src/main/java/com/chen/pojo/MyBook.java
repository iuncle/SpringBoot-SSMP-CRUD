package com.chen.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyBook {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String detail;
    private Double price;

    public MyBook(String name,String detail,double price){
        this.name=name;
        this.detail=detail;
        this.price=price;
    }
}
