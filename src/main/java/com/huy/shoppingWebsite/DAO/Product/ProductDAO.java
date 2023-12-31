package com.huy.shoppingWebsite.DAO.Product;

import com.huy.shoppingWebsite.Entity.Product;

public interface ProductDAO {
    void save(Product product);
    void update(Product product);
    Product findProductById(int id);
    void deleteProductById(int id);
}
