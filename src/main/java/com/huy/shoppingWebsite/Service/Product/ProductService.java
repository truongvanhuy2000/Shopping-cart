package com.huy.shoppingWebsite.Service.Product;

import com.huy.shoppingWebsite.Entity.Product;

public interface ProductService {
    void save(Product product);
    void update(Product product);
    Product findProductById(int id);
    void deleteProductById(int id);
}
