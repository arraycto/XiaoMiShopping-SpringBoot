package com.zty.blog.server.Service.RegLogin;

import com.zty.blog.server.Entity.User;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public interface RegLogService {

    SqlSession getSqlSession() throws IOException;

    User getUserByEmail(String email) throws IOException;

    User getUserByUserName(String username) throws IOException;

    void insertUser(String userid,String name,String email,String pwd,String phone) throws IOException;

}
