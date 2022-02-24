package com.shed.dao.impl;

import com.shed.dao.AccountDao;
import com.shed.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Account account) {
        int rowUpdate = jdbcTemplate.update("INSERT INTO t_account VALUES(?,?,?)",
                                                    null,account.getName(),account.getBalance());
        return rowUpdate;
    }

    @Override
    public int out(String outMan, Double money) {
        int rowUpdate = jdbcTemplate.update("UPDATE t_account SET balance=balance-? WHERE name=?",money,outMan);
        return rowUpdate;
    }

    @Override
    public int in(String inMan, Double money) {
        int rowUpdate = jdbcTemplate.update("UPDATE t_account SET balance=balance+? WHERE name=?",money,inMan);
        return rowUpdate;
    }
}
