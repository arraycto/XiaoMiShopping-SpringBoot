package com.zty.blog.server.Service.RegLogin;

import com.zty.blog.server.Dao.RegLogUser;
import com.zty.blog.server.Entity.User;
import com.zty.blog.server.Service.RegLogin.RegLogService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.io.InputStream;

@Service
public class RegLogServiceImp implements RegLogService {

    @Override
    public SqlSession getSqlSession() throws IOException {
        String resource = "mybatis-config.xml";//通过流处理获取sqlSessionFactory创建一个实例
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();//获取SqlSession实例
        return session;
    }

    @Override
    public User getUserByEmail(String email) throws IOException {
            SqlSession sqlSession=getSqlSession();
            User user = sqlSession.getMapper(RegLogUser.class).getUserByEmail(email);
            sqlSession.commit();
            sqlSession.close();
            return user;
    }

    @Override
    public User getUserByUserName(String username) throws IOException {
        SqlSession sqlSession=getSqlSession();
        User user = sqlSession.getMapper(RegLogUser.class).getUserByUserName(username);
        sqlSession.commit();
        sqlSession.close();
        return user;
    }

    @Override
    public void insertUser(String userid,String name, String email, String pwd,String phone) throws IOException {
        SqlSession sqlSession=getSqlSession();
        System.out.println(userid);
        System.out.println(name);
        System.out.println(email);
        System.out.println(pwd);
        System.out.println(phone);

        sqlSession.getMapper(RegLogUser.class).insertUser(userid,name,email,pwd,phone);

        sqlSession.commit();
        sqlSession.close();
    }
}
