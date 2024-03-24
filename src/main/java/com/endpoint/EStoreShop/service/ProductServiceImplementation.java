package com.endpoint.EStoreShop.service;
import com.endpoint.EStoreShop.entity.Product;
import com.endpoint.EStoreShop.repository.ProductRepository;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImplementation implements ProductService  {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);

    }

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>)productRepository.findAll();
    }

    @Override
    public Product getProductById(Long productID) {
        return productRepository.findById(productID).orElse(null);
    }


    @Override
    public Product updateProduct(Product product, Long productId) {
        Product prodDB
                = productRepository.findById(productId).get();

        if (Objects.nonNull(product.getProductName()) && !"".equalsIgnoreCase(product.getProductName()))
        {
            prodDB.setProductName( product.getProductName());
        }

        if (Objects.nonNull(product.getPrice()) )
        {
            prodDB.setPrice(product.getPrice());
        }

        if (Objects.nonNull(product.getProductCode())  && !"".equalsIgnoreCase(product.getProductCode()))
        {
            prodDB.setProductCode(product.getProductCode());
        }

        return productRepository.save(prodDB);
    }

    @Override
    public void deleteProductById(Long ProductId) {
        productRepository.deleteById(ProductId);
    }
}


