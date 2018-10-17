package com.louis.service.impl;

import com.louis.dao.mapper.AccountMapper;
import com.louis.entity.Account;
import com.louis.entity.AccountExample;
import com.louis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lcn_louis @Date: 2018/9/29 下午2:17
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> getUsers(Integer id) {
        AccountExample example = new AccountExample();
        AccountExample.Criteria criteria = example.createCriteria();
        if (id != null) {
            criteria.andIdEqualTo(id);
        } else {
            criteria.andIdIsNotNull();
        }
        return accountMapper.selectByExample(example);
    }

    @Override
    public Integer addUser(String name, String password) {
        Account account = new Account();
        account.setName(name);
        account.setPassword(password);
        return accountMapper.insertSelective(account);
    }

    @Override
    public Integer deleteUserBypw(String password) {
        AccountExample example = new AccountExample();
        AccountExample.Criteria criteria = example.createCriteria();
        if (password != null) {
            criteria.andPasswordEqualTo(password);
        }
        return accountMapper.deleteByExample(example);
    }
}
