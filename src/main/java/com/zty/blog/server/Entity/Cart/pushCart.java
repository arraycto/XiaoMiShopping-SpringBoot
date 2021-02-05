package com.zty.blog.server.Entity.Cart;

import lombok.Data;

@Data
public class pushCart {
    private String token;
    private int productId;
    private String username;
    private boolean select;

}
