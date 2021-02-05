package com.zty.blog.server.Controller;

import com.zty.blog.server.Entity.ProductFoot.ProductFootInfo;
import com.zty.blog.server.Entity.ProductFoot.ProductFootResult;
import com.zty.blog.server.Entity.ProductHead.ProductHeadInfo;
import com.zty.blog.server.Entity.ProductHead.ProductHeadResult;
import com.zty.blog.server.Entity.index.CategoryResult;
import com.zty.blog.server.Service.Category.CategoryIndexImp;
import com.zty.blog.server.Service.ProdFoot.ProductFootImp;
import com.zty.blog.server.Service.ProdHead.ProductHeadImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("index")
public class IndexController {
    @Autowired
    private CategoryIndexImp categoryIndexImp;
    @Autowired
    private ProductHeadImp productHeadImp;
    @Autowired
    private ProductFootImp productFootImp;

    @RequestMapping("/category")
    public CategoryResult getCategory() throws IOException {
        CategoryResult categoryResult = new CategoryResult();
        categoryResult.setStatus(0);
        categoryResult = categoryIndexImp.getCategoryGoods();
        return categoryResult;
    }

    @RequestMapping("/product")
    public ProductHeadResult getProduct(@RequestParam("categoryId") int categoryId,
                                        @RequestParam("pageStart") int pageStart) throws IOException {

        ProductHeadResult productHeadResult = new ProductHeadResult();
        productHeadResult.setStatus(0);
        List<ProductHeadInfo> productHeadInfo = productHeadImp.getProductHeadInfo(categoryId,
                (categoryId - 1) * 12 + (pageStart-1)*6+1, (categoryId - 1) * 12 + pageStart*6);
        productHeadResult.setData(productHeadInfo);
        return productHeadResult;
    }

    @RequestMapping("/productfoot")
    public ProductFootResult getProductFoot(@RequestParam("categoryId") int categoryId,
                                            @RequestParam("pageStart") int pageStart) throws IOException {

        ProductFootResult productFootResult = new ProductFootResult();
        productFootResult.setStatus(0);
        List<ProductFootInfo> productFootInfo = productFootImp.getProductFootInfo(categoryId, (categoryId - 1) * 12 + (pageStart - 1) * 8 + 1, (categoryId - 1) * 12 + pageStart * 8);
        productFootResult.setData(productFootInfo);
        return productFootResult;
    }
}
