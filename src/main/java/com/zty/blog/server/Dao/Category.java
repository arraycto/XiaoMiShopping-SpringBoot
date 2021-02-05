package com.zty.blog.server.Dao;

import com.zty.blog.server.Entity.index.GoodCategory;
import com.zty.blog.server.Entity.index.CategoryGood;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface Category {
    @Select("select good_id,icon,name from goods where category_id = #{category_id}" +
            " and good_id between #{start} and #{end}")
    List<CategoryGood> getGoodbyCategory(int category_id,int start,int end);

    @Select("select categoryId,name from category where categoryId = #{category_id}")
    GoodCategory getGoodCategory(int category_id);
}
