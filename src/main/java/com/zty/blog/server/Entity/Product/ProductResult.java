package com.zty.blog.server.Entity.Product;

import lombok.Data;

@Data
public class ProductResult {
    private int status;
    private ProductInfo data;
}
