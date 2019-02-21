package com.example.superwoman.service.impl;

import com.example.superwoman.dao.UserDao;
import com.example.superwoman.entity.User;
import com.example.superwoman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserserviceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public boolean selectUserByName(String name) {
        User user = userDao.selectUserByName(name);
        if(user.getPassword() != null) {
            System.out.println(user.getPassword());
            System.out.println("连接数据库成功");
            return true;
        }
        return false;
    }

    @Override
    public boolean insertUser(String username, String password) {
        userDao.insertHappiness(username,Integer.valueOf(password));
        return false;
    }
}
