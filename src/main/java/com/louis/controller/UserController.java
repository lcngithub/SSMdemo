package com.louis.controller;

import com.louis.entity.Account;
import com.louis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** @Author: lcn_louis @Date: 2018/9/29 下午2:17 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
  private static final Logger logger = LoggerFactory.getLogger(UserController.class);
  @Autowired private UserService userService;

  @RequestMapping(value = "/getUser")
  @ResponseBody
  public Map<String, Object> getUsers(Integer id) {
    Map<String, Object> map = new HashMap<>();
    // 调用service方法得到用户列表
    List<Account> users = userService.getUsers(id);
    logger.info("成功查询用户列表！");
    map.put("account", users);
    return map;
  }

  @RequestMapping(value = "/addUser")
  @ResponseBody
  public Map<String, Object> addUser(String name, String password) {
    Map<String, Object> map = new HashMap<>();
    Integer i = userService.addUser(name, password);
    if (i == 1) {
      map.put("code", 1);
      map.put("data", name + "||" + password);
    } else map.put("code", -1);
    return map;
  }

  @RequestMapping(value = "/deleteUser")
  @ResponseBody
  public Map<String, Object> deleteUser(String password) {
    Map<String, Object> map = new HashMap<>();
    Integer i = userService.deleteUserBypw(password);
    if (i > 0) map.put("code", 1);
    else map.put("code", -1);
    return map;
  }
}
