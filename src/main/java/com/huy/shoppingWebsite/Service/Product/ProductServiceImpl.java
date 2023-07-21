package com.huy.shoppingWebsite.Service.Product;

import com.huy.shoppingWebsite.DAO.Product.ProductDAO;
import com.huy.shoppingWebsite.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductDAO productDAO;
    @Autowired
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public void save(Product product) {
        productDAO.save(product);
    }

    @Override
    public void update(Product product) {
        productDAO.update(product);
    }

    @Override
    public Product findProductById(int id) {
        return productDAO.findProductById(id);
    }

    @Override
    public void deleteProductById(int id) {
        productDAO.deleteProductById(id);
    }
}
