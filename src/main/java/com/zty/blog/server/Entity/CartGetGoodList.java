package com.zty.blog.server.Entity;

import lombok.Data;

import java.util.List;


@Data public class CartGetGoodList {
    private List<CartGetGoodItem> items;
}
