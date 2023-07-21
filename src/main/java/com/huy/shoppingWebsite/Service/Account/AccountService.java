package com.huy.shoppingWebsite.Service.Account;

import com.huy.shoppingWebsite.Entity.Account;
import com.huy.shoppingWebsite.Entity.AccountInformation;

public interface AccountService {

    void save(Account account);
    Account findAccountById(int id);
    void deleteAccountById(int id);
    void update(Account account);
    AccountInformation findAccountInformation(int id);
    void deleteAccountInformation(int id);
}
