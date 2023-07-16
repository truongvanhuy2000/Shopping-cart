package com.huy.shoppingWebsite.DAO.Cart;
import com.huy.shoppingWebsite.Entity.Cart;
import com.huy.shoppingWebsite.Entity.Product;

import java.util.List;

public interface CartDAO {
    void save(Cart cart);
    Cart findCartById(int id);
    void deleteCartById(int id);
    void update(Cart cart);
    Cart findCartAndProductByCartId(int id);
}
