package com.jingxuan.service.impl;

import com.jingxuan.dao.AccountDao;
import com.jingxuan.domain.Account;
import com.jingxuan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有的账户信息");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存账户");
        accountDao.saveAccount(account);
    }
}
