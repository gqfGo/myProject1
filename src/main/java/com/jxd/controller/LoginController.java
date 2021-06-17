package com.jxd.controller;

import com.jxd.model.User;
import com.jxd.service.IEmpService;
import com.jxd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhouYufei
 * @description Todo
 * @date 2021-03-09 14:12
 */
@RestController
public class LoginController {
    @Autowired
    private IUserService userService;
    /**
     * 根据用户名和密码进行登录
     * @param user
     * @return 登录成功的标志
     */
    @RequestMapping("/login")
    public Map<String,Object> login(@RequestBody User user) {
        Map<String,Object> map = new HashMap<>();
        String str = "error";
        //对用户名做了去重处理，获取条数应该为1
        int count = userService.login(user);
        if (count == 1) {
            str = "ok";
            map.put("user", userService.getUserMsg(user));
        }
        map.put("flag",str);
        return map;
    }
}
