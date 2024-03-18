package com.endpoint.EStoreShop.controller;

import com.endpoint.EStoreShop.entity.Product;
import com.endpoint.EStoreShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired private ProductService productService;

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product)
    {
        return productService.saveProduct(product);
    }
    @GetMapping("/products")
    public List<Product> getAllProduct()
    {
        return productService.getAllProducts();
    }
    @PutMapping("/products/{id}")
    public Product updateProduct (@RequestBody Product product, @PathVariable("id") Long productId)
    {
        return productService.updateProduct(product,productId);
    }
    @DeleteMapping("/products/{id}")
    public String deleteProductById(@PathVariable("id") Long productId)
    {
        productService.deleteProductById(
                productId);
        return "Deleted Successfully";
    }

}
