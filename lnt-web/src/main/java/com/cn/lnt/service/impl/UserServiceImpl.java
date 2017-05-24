package com.cn.lnt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.lnt.dao.IUserDao;
import com.cn.lnt.pojo.User;
import com.cn.lnt.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private IUserDao userDao;  
    @Override  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
} 
