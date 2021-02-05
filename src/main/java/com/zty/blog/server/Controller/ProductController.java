package com.zty.blog.server.Controller;

import com.zty.blog.server.Entity.Product.ProductResult;
import com.zty.blog.server.Service.Product.ProdServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProdServiceImp prodServiceImp;
    @RequestMapping("getinfo")
    public ProductResult getProductInfo(@RequestParam("id") int id) throws IOException {
        ProductResult productResult = new ProductResult();
        productResult.setStatus(0);
        productResult.setData(prodServiceImp.getProductInfo(id));
        return productResult;
    }

}
