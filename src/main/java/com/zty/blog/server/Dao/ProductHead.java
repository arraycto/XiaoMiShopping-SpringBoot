package com.zty.blog.server.Dao;

import com.zty.blog.server.Entity.ProductHead.ProductHeadInfo;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface ProductHead {
    @Select("select good_id,name,imageHead,price from goods where category_id = #{categoryId}" +
            " and good_id between #{pageStart} and #{pageEnd}")
    List<ProductHeadInfo> getProductHeadInfo(int categoryId, int pageStart, int pageEnd);
}
