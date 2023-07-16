package com.huy.shoppingWebsite.DAO.Account;

import com.huy.shoppingWebsite.Entity.Account;
import com.huy.shoppingWebsite.Entity.AccountInformation;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO{
    private final EntityManager entityManager;
    @Autowired
    public AccountDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Account account) {
        entityManager.persist(account);
    }

    @Override
    public Account findAccountById(int id) {
        return entityManager.find(Account.class, id);
    }

    @Override
    @Transactional
    public void deleteAccountById(int id) {
        Account tempAccount = findAccountById(id);
        entityManager.remove(tempAccount);
    }

    @Override
    @Transactional
    public void update(Account account) {
        entityManager.merge(account);
    }

    @Override
    public AccountInformation findAccountInformation(int id) {
        return entityManager.find(AccountInformation.class, id);
    }

    @Override
    @Transactional
    public void deleteAccountInformation(int id) {
        AccountInformation tempInformation = findAccountInformation(id);
        // Remove the associated object reference
        tempInformation.getAccount().setAccountInformation(null);
        entityManager.remove(tempInformation);
    }
}
