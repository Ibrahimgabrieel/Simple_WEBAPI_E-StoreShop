package com.endpoint.EStoreShop.repository;
import com.endpoint.EStoreShop.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProductRepository extends CrudRepository <Product, Long>
{

}
