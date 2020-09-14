package cn.bdqn.test;

import cn.bdqn.domain.Account;
import cn.bdqn.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAndMybatis02 {
    @Test
    public void Test() throws Exception{

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        AccountService accountService = (AccountService) ac.getBean("accountService");

        Account account = new Account();
        account.setName("罗磊");
        account.setAge(12);
        account.setBalance(2000);

        accountService.save(account);


    }
}
