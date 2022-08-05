package com.jing.product.controller;

import com.jing.product.model.ProductModel;
import com.jing.product.model.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/list")
    public Result<String> list(){
        System.out.println("hello list");
        return Result.ofSuccess("success");
    }

    @PostMapping("/save")
    public Result<ProductModel> save(@RequestBody ProductModel productModel){
        System.out.println("hello save product:"+productModel);
        return Result.ofSuccess(productModel);
    }

    @GetMapping("/exp")
    public Result<String> exp(){
        System.out.println("hahahahaahahah==================================================");
       int i = 1/0;
        return Result.ofSuccess("success");
    }

    @GetMapping("/time")
    public Result<String> time(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Result.ofSuccess("success");
    }
}
