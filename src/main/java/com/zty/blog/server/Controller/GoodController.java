package com.zty.blog.server.Controller;

import com.zty.blog.server.Entity.Good;
import com.zty.blog.server.Entity.GoodAll;
import com.zty.blog.server.Entity.index.GoodCategory;
import com.zty.blog.server.Entity.GoodsAll;
import com.zty.blog.server.Service.Good.GoodServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("goods")
public class GoodController {
        @Autowired
        private GoodServiceImp goodServiceImp;

        @RequestMapping("getGoodsAll")
        private GoodsAll getGoodByCategory() throws IOException {
                GoodsAll goodsAll = new GoodsAll();
                ArrayList<GoodAll> goodAlls = new ArrayList<>();
                for (int i = 1; i <= 9; i++) {
                        List<Good> good = goodServiceImp.getGood(i);
                        GoodCategory goodCategory = goodServiceImp.getGoodCategory(i);
                        GoodAll goodAll = new GoodAll();
                        goodAll.setName(goodCategory.getName());
                        goodAll.setFoods(good);
                        goodAlls.add(goodAll);
                }
                goodsAll.setData(goodAlls);
                return goodsAll;
        }
}
