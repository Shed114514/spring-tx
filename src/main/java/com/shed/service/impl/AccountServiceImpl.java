package com.shed.service.impl;

import com.shed.dao.AccountDao;
import com.shed.domain.Account;
import com.shed.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    @Resource(name = "accountDao")
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public boolean createAccount(Account account) {
        accountDao.insert(account);
        System.out.println("新账户创建成功!");
        return true;
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public void transfer(String outMan, String inMan, Double money) {
       accountDao.out(outMan,money);
       int a = 1/0;
       accountDao.in(inMan,money);
    }
}
