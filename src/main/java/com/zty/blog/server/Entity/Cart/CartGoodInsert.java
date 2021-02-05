package com.zty.blog.server.Entity.Cart;

import lombok.Data;

@Data
public class CartGoodInsert {
    private String name;
    private int price;
    private int status;
    private String subtitle;
    private int productStock;
}
