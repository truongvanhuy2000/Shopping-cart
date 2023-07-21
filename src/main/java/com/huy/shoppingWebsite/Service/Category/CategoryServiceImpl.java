package com.huy.shoppingWebsite.Service.Category;

import com.huy.shoppingWebsite.DAO.Category.CategoryDAO;
import com.huy.shoppingWebsite.Entity.Category;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements CategoryService {
    private final CategoryDAO categoryDAO;

    @Autowired
    public CategoryServiceImpl(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    @Override
    public void save(Category category) {
        categoryDAO.save(category);
    }

    @Override
    public Category findCategoryById(int id) {
        return categoryDAO.findCategoryById(id);
    }

    @Override
    public void update(Category category) {
        categoryDAO.update(category);
    }

    @Override
    public void deleteCategoryById(int id) {
        categoryDAO.deleteCategoryById(id);
    }

    @Override
    public Category findCategoryAndProductsByCategoryId(int id) {
        return categoryDAO.findCategoryAndProductsByCategoryId(id);
    }
}
