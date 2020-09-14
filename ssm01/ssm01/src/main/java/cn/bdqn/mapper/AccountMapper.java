package cn.bdqn.mapper;

import cn.bdqn.domain.Account;

import java.util.List;

public interface AccountMapper {

    public List<Account> selectAll();

    public void insert(Account account);

}
