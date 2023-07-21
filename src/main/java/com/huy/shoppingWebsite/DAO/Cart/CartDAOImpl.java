package com.huy.shoppingWebsite.DAO.Cart;

import com.huy.shoppingWebsite.Entity.Cart;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAOImpl implements CartDAO{
    private final EntityManager entityManager;
    @Autowired
    public CartDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Cart cart) {
        entityManager.persist(cart);
    }

    @Override
    public Cart findCartById(int id) {
        return entityManager.find(Cart.class, id);
    }

    @Override
    @Transactional
    public void deleteCartById(int id) {
        Cart tempCart = findCartById(id);
        entityManager.remove(tempCart);
    }

    @Override
    @Transactional
    public void update(Cart cart) {
        entityManager.merge(cart);
    }

    @Override
    public Cart findCartAndProductByCartId(int id) {
        TypedQuery<Cart> query = entityManager.createQuery(
                "select c from Cart c "
                + "JOIN FETCH c.products "
                + "where c.id = :data", Cart.class
        );
        query.setParameter("data", id);
        return query.getSingleResult();
    }
}
