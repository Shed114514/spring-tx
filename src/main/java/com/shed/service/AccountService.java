package com.shed.service;

import com.shed.domain.Account;

public interface AccountService {

    /**
     * 创建账户
     */
    boolean createAccount(Account account);

    /**
     * Description: 转账操作
     * @param outMan 转账人
     * @param inMan 收款人
     * @param money 转账金额
     */
    void transfer(String outMan,String inMan,Double money);
}
