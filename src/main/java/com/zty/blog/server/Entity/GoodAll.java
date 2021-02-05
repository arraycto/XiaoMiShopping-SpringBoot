package com.zty.blog.server.Entity;

import lombok.Data;

import java.util.List;

@Data
public class GoodAll {
    private String name;
    private int type;
    private List<Good> foods;
}
