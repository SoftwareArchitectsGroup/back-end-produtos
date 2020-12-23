package com.produtos.produtos.Controller;

import com.produtos.produtos.Model.Product;
import com.produtos.produtos.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public void createProduct(@RequestBody Product product) {
        productService.save(product);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        productService.delete(id);
    }

    @PutMapping
    public void updateProduct(@RequestBody Product product){
        productService.update(product);
    }

}
