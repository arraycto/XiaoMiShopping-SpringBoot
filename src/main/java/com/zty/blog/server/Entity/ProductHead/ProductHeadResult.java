package com.zty.blog.server.Entity.ProductHead;

import lombok.Data;
import java.util.List;

@Data
public class ProductHeadResult {
    private int status;
    private List<ProductHeadInfo> data;
}
