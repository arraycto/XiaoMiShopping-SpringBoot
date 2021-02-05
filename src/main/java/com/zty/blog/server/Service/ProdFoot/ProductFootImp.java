package com.zty.blog.server.Service.ProdFoot;

import com.zty.blog.server.Dao.ProductFoot;
import com.zty.blog.server.Dao.ProductHead;
import com.zty.blog.server.Entity.ProductFoot.ProductFootInfo;
import com.zty.blog.server.Entity.ProductHead.ProductHeadInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class ProductFootImp implements ProdFoot {

    @Override
    public SqlSession getSqlSession() throws IOException {
        String resource = "mybatis-config.xml";//通过流处理获取sqlSessionFactory创建一个实例
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();//获取SqlSession实例
        return session;
    }

    @Override
    public List<ProductFootInfo> getProductFootInfo(int categoryId, int pageStart, int pageEnd) throws IOException {
        SqlSession sqlSession = getSqlSession();
        List<ProductFootInfo> productInfoById = sqlSession.getMapper(ProductFoot.class)
                .getProductFootInfo(categoryId,pageStart,pageEnd);
        return  productInfoById;
    }
}
