package com.huy.shoppingWebsite.Service.Account;

import com.huy.shoppingWebsite.DAO.Account.AccountDAO;
import com.huy.shoppingWebsite.Entity.Account;
import com.huy.shoppingWebsite.Entity.AccountInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
    private final AccountDAO accountDAO;

    @Autowired
    public AccountServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void save(Account account) {
        accountDAO.save(account);
    }

    @Override
    public Account findAccountById(int id) {
        return accountDAO.findAccountById(id);
    }

    @Override
    public void deleteAccountById(int id) {
        accountDAO.deleteAccountById(id);
    }

    @Override
    public void update(Account account) {
        accountDAO.update(account);
    }

    @Override
    public AccountInformation findAccountInformation(int id) {
        return accountDAO.findAccountInformation(id);
    }

    @Override
    public void deleteAccountInformation(int id) {
        accountDAO.deleteAccountInformation(id);
    }
}
