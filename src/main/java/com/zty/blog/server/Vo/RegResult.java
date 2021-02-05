package com.zty.blog.server.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;

//0注册成功,2002该邮箱已注册
@Data
public class RegResult {
    private int status=0;
    private String msg;

}
