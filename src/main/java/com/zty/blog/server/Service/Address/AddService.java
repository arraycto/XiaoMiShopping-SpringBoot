package com.zty.blog.server.Service.Address;

import com.zty.blog.server.Entity.Address.AddrResult;
import com.zty.blog.server.Entity.Address.AddrSuccResult;
import com.zty.blog.server.Entity.Address.Addre;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;

public interface AddService {
    SqlSession getSqlSession() throws IOException;
    AddrSuccResult inseAddre(Addre addre) throws IOException;
    AddrResult getAll(String userid) throws IOException;
    AddrSuccResult updaAddre(Addre addre) throws IOException;
    AddrSuccResult deleAddre(int id) throws IOException;
}
