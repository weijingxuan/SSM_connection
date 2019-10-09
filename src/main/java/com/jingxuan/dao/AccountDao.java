package com.jingxuan.dao;

import com.jingxuan.domain.Account;

import java.util.List;

public interface AccountDao {

    /**
     * 查询所有
     * @return
     */
    public List<Account>findAll();

    /**
     * 保存
     * @param account
     */
    public void saveAccount(Account account);
}
