package com.zty.blog.server.Service.ProdFoot;

import com.zty.blog.server.Entity.ProductFoot.ProductFootInfo;
import com.zty.blog.server.Entity.ProductHead.ProductHeadInfo;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public interface ProdFoot {
    SqlSession getSqlSession() throws IOException;
    List<ProductFootInfo> getProductFootInfo(int categoryId, int pageStart, int pageEnd) throws IOException;
}
