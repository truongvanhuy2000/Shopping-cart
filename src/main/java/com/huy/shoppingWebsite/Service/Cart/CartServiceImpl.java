package com.huy.shoppingWebsite.Service.Cart;

import com.huy.shoppingWebsite.DAO.Cart.CartDAO;
import com.huy.shoppingWebsite.Entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{
    private final CartDAO cartDAO;

    @Autowired
    public CartServiceImpl(CartDAO cartDAO) {
        this.cartDAO = cartDAO;
    }

    @Override
    public void save(Cart cart) {
        cartDAO.save(cart);
    }

    @Override
    public Cart findCartById(int id) {
        return cartDAO.findCartById(id);
    }

    @Override
    public void deleteCartById(int id) {
        cartDAO.deleteCartById(id);
    }

    @Override
    public void update(Cart cart) {
        cartDAO.update(cart);
    }

    @Override
    public Cart findCartAndProductByCartId(int id) {
        return cartDAO.findCartAndProductByCartId(id);
    }
}
