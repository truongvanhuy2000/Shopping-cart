package com.huy.shoppingWebsite.DAO.Account;

import com.huy.shoppingWebsite.Entity.Account;
import com.huy.shoppingWebsite.Entity.AccountInformation;

public interface AccountDAO {
    void save(Account account);
    Account findAccountById(int id);
    void deleteAccountById(int id);
    void update(Account account);
    AccountInformation findAccountInformation(int id);
    void deleteAccountInformation(int id);
}
