package com.zty.blog.server.Dao;

import com.zty.blog.server.Entity.Address.Addre;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

public interface Address {
    @Insert("insert into address(userid,receiverName,receiverMobile,receiverProvince,receiverCity,receiverAddress,receiverZip)" +
            " values(#{userid},#{receiverName},#{receiverMobile},#{receiverProvince}" +
            ",#{receiverCity},#{receiverAddress},#{receiverZip})")
    void inseAddre(String userid,String receiverName,String receiverMobile,String receiverProvince, String receiverCity,String receiverAddress,String receiverZip);

    @Update("update address set receiverName = #{receiverName},receiverMobile = #{receiverMobile},receiverProvince=" +
            "#{receiverProvince},receiverCity= #{receiverCity},receiverAddress= #{receiverAddress} ,receiverZip= #{receiverZip}" +
            "where id = #{id} and userid like #{userid}")
    void updateAddre(String userid,int id ,String receiverName,String receiverMobile,String receiverProvince,
                   String receiverCity,String receiverAddress,String receiverZip);

    @Delete("delete from address where id = #{id}")
    void deleteAddre(int id);

    @Select("select * from address where userid like #{userid}")
    List<Addre> getAll(String userid);

}
