package com.jxd.service.impl;

import com.jxd.dao.IUserDao;
import com.jxd.model.User;
import com.jxd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZhouYufei
 * @description Todo
 * @date 2021-03-09 14:26
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;
    /**
     * 根据用户名和密码进行登录
     * @param user
     * @return 登录成功的标志
     */
    @Override
    public int login(User user) {
        return userDao.login(user);
    }

    /**
     * 根据用户名和密码获取员工的详细信息
     *
     * @param user
     * @return
     */
    @Override
    public User getUserMsg(User user) {
        return userDao.getUserMsg(user);
    }
}
