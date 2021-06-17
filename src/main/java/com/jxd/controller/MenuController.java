package com.jxd.controller;

import com.jxd.dao.IMenuDao;
import com.jxd.model.MainMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ZhouYufei
 * @description Todo
 * @date 2021-03-11 18:03
 */
@RestController
public class MenuController {
    @Autowired
    private IMenuDao menuDao;
    @RequestMapping("/menus")
    public Map<String, Object> getAllMenus() {
        Map<String, Object> map = new HashMap<>();
        //错误404，成功200
        List<MainMenu> menus = menuDao.getMenus();
        if(menus != null) {
            map.put("menus", menus);
            map.put("flag", 200);
        } else {
            map.put("flag", 404);
        }
        return map;
    }
}
