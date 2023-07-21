package com.huy.shoppingWebsite.DAO.Category;

import com.huy.shoppingWebsite.Entity.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
    private final EntityManager entityManager;
    @Autowired
    public CategoryDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Category category) {
        entityManager.persist(category);
    }

    @Override
    public Category findCategoryById(int id) {
        return entityManager.find(Category.class, id);
    }

    @Override
    public void update(Category category) {
        entityManager.merge(category);
    }

    @Override
    public void deleteCategoryById(int id) {
        Category tempCategory = findCategoryById(id);
        entityManager.remove(tempCategory);
    }

    @Override
    public Category findCategoryAndProductsByCategoryId(int id) {
        TypedQuery<Category> query = entityManager.createQuery(
                "select c from Category c "
                + "JOINT FETCH c.products "
                + "where c.id = :data", Category.class
        );
        query.setParameter("data", id);
        return query.getSingleResult();
    }
}
