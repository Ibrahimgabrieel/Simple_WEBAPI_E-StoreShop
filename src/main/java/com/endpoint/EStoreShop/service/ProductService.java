package com.endpoint.EStoreShop.service;

import java.util.List;
import com.endpoint.EStoreShop.entity.Product;
public interface ProductService {

 Product saveProduct (Product product);
 List<Product> getAllProducts();

 Product updateProduct (Product product, Long productId);

 void deleteProductById (Long ProductId);
}
