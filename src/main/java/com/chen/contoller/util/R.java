package com.chen.contoller.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R {
    private Boolean flag;
    private Object data;

    public R(Boolean flag){
        this.flag=flag;
    }
}
