package com.zty.blog.server.Entity.index;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;
@Data
public class Categor {
    private int categoryId;
    private String name;
    private ArrayList<List<CategoryGood>> menuList;
}
