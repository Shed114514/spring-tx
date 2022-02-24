package com.shed.test;

import com.shed.domain.Account;
import com.shed.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void test1() {
        accountService.createAccount(new Account("Cindy",5000.0));
    }

    @Test
    public void test2() {
        accountService.transfer("Allen","Brian",100.0);
    }

    @Test
    public void test3() {
        accountService.transfer("Brian","Allen",100.0);
    }
}
