package com.wz.pumer.service.impl;

import com.wz.pumer.beans.UserBean;
import com.wz.pumer.dao.IUserDao;
import com.wz.pumer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wang_zhen1 on 2017/10/16 0016.
 */

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    public IUserDao userDao;


    @Override
    public UserBean loginByNameAndPwd(String name, String pwd) {
        return userDao.loginByNameAndPwd(name,pwd);
    }

    @Override
    public UserBean loginByqq(String qq) {
        return userDao.loginByqq(qq);
    }

    @Override
    public UserBean getUserById(String id) {
        return userDao.getUserById(id);
    }

    @Override
    public int updateUserInfo(UserBean bean) {
        return userDao.updateUserInfo(bean);
    }

    @Override
    public int regUser(UserBean bean) {
        return userDao.regUser(bean);
    }
}
