package com.huy.shoppingWebsite.Service.Category;

import com.huy.shoppingWebsite.Entity.Category;

import java.util.List;

public interface CategoryService {
    void save(Category category);
    Category findCategoryById(int id);
    void update(Category category);
    void deleteCategoryById(int id);
    Category findCategoryAndProductsByCategoryId(int id);
    List<Category> findAllCategory();
}
