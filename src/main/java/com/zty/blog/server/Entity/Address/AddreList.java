package com.zty.blog.server.Entity.Address;

import lombok.Data;
import java.util.List;

@Data
public class AddreList {
    private int total;
    private List<Addre> addreList;
}
