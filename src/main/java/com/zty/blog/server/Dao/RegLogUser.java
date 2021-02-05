package com.zty.blog.server.Dao;

import com.zty.blog.server.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface RegLogUser {
    @Select("select userid,name,email,pwd,tel from userinfo where email like #{email}")
    User getUserByEmail(String email);

    @Select("select userid,name,email,pwd,tel from userinfo where name like #{username}")
    User getUserByUserName(String username);

    @Insert("insert into userinfo values(#{userid},#{name},#{email},#{pwd},#{phone})")
    void insertUser(String userid,String name,String email,String pwd,String phone);


}
