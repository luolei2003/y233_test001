package cn.bdqn.service;

import cn.bdqn.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> queryAll();

    public void save(Account account);

}
