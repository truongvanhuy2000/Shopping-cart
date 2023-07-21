package com.huy.shoppingWebsite.DAO.Product;

import com.huy.shoppingWebsite.Entity.Category;
import com.huy.shoppingWebsite.Entity.Product;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO{
    private final EntityManager entityManager;
    @Autowired
    public ProductDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public void save(Product product) {
        entityManager.persist(product);
    }

    @Override
    public void update(Product product) {
        entityManager.merge(product);
    }

    @Override
    public Product findProductById(int id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public void deleteProductById(int id) {
        Product tempProduct = findProductById(id);
        entityManager.remove(tempProduct);
    }
}
