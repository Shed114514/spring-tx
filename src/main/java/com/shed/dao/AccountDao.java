package com.shed.dao;

import com.shed.domain.Account;

public interface AccountDao {
    int insert(Account account);

    int out(String outMan,Double money);

    int in(String inMan,Double money);
}
