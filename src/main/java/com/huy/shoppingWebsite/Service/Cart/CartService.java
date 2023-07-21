package com.huy.shoppingWebsite.Service.Cart;

import com.huy.shoppingWebsite.Entity.Cart;

public interface CartService {
    void save(Cart cart);
    Cart findCartById(int id);
    void deleteCartById(int id);
    void update(Cart cart);
    Cart findCartAndProductByCartId(int id);
}
