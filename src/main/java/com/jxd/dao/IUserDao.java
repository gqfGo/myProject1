package com.jxd.dao;

import com.jxd.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ZhouYufei
 * @description Todo
 * @date 2021-03-09 14:26
 */
public interface IUserDao {
    /**
     * 根据用户名和密码进行登录
     * @param user
     * @return 登录成功的标志
     */
    int login(User user);

    /**
     * 根据用户名和密码获取员工的详细信息
     * @param user
     * @return
     */
    User getUserMsg(User user);

}
