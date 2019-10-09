package com.jingxuan.service;

import com.jingxuan.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountService {

    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存
     * @param account
     */
    public void saveAccount(Account account);
}
