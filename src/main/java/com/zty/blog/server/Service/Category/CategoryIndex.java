package com.zty.blog.server.Service.Category;

import com.zty.blog.server.Entity.index.CategoryGood;
import com.zty.blog.server.Entity.index.CategoryResult;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public interface CategoryIndex {
    SqlSession getSqlSession() throws IOException;
    CategoryResult getCategoryGoods() throws IOException;
}
