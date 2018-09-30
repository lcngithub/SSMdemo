package com.louis.service;

import com.louis.entity.Account;

import java.util.List;

/** @Author: lcn_louis @Date: 2018/9/29 下午2:20 */
public interface UserService {
  List<Account> getUsers(Integer id);

  Integer addUser(String name, String password);

  Integer deleteUserBypw(String password);
}
